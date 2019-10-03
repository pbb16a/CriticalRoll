package com.example.criticalroll;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {

    public int clicksTotal;
    public int clicks1_int;
    public int clicks2_int;
    public int clicks3_int;
    public int clicks4_int;
    public int clicks5_int;
    public int clicks6_int;
    public int clicks7_int;
    public int clicks8_int;
    public int clicks9_int;
    public int clicks10_int;
    public int clicks11_int;
    public int clicks12_int;
    public int clicks13_int;
    public int clicks14_int;
    public int clicks15_int;
    public int clicks16_int;
    public int clicks17_int;
    public int clicks18_int;
    public int clicks19_int;
    public int clicks20_int;
    public TextView total;
    public TextView total1;
    public TextView total2;
    public TextView total3;
    public TextView total4;
    public TextView total5;
    public TextView total6;
    public TextView total7;
    public TextView total8;
    public TextView total9;
    public TextView total10;
    public TextView total11;
    public TextView total12;
    public TextView total13;
    public TextView total14;
    public TextView total15;
    public TextView total16;
    public TextView total17;
    public TextView total18;
    public TextView total19;
    public TextView total20;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);


        total = findViewById(R.id.textTotal);
        total1 = findViewById(R.id.text1s);
        total2 = findViewById(R.id.text2s);
        total3 = findViewById(R.id.text3s);
        total4 = findViewById(R.id.text4s);
        total5 = findViewById(R.id.text5s);
        total6 = findViewById(R.id.text6s);
        total7 = findViewById(R.id.text7s);
        total8 = findViewById(R.id.text8s);
        total9 = findViewById(R.id.text9s);
        total10 = findViewById(R.id.text10s);
        total11 = findViewById(R.id.text11s);
        total12 = findViewById(R.id.text12s);
        total13 = findViewById(R.id.text13s);
        total14 = findViewById(R.id.text14s);
        total15 = findViewById(R.id.text15s);
        total16 = findViewById(R.id.text16s);
        total17 = findViewById(R.id.text17s);
        total18 = findViewById(R.id.text18s);
        total19 = findViewById(R.id.text19s);
        total20 = findViewById(R.id.text20s);


        int defaultTotal = getResources().getInteger(R.integer.clicksTotal);
        clicksTotal = sharedPref.getInt(getString(R.string.timesTotal), defaultTotal);

        int default1 = getResources().getInteger(R.integer.clicks1);
        clicks1_int = sharedPref.getInt(getString(R.string.times1), default1);

        int default2 = getResources().getInteger(R.integer.clicks2);
        clicks2_int = sharedPref.getInt(getString(R.string.times2), default2);

        int default3 = getResources().getInteger(R.integer.clicks3);
        clicks3_int = sharedPref.getInt(getString(R.string.times3), default3);

        int default4 = getResources().getInteger(R.integer.clicks4);
        clicks4_int = sharedPref.getInt(getString(R.string.times4), default4);

        int default5 = getResources().getInteger(R.integer.clicks5);
        clicks5_int = sharedPref.getInt(getString(R.string.times5), default5);

        int default6 = getResources().getInteger(R.integer.clicks6);
        clicks6_int = sharedPref.getInt(getString(R.string.times6), default6);

        int default7 = getResources().getInteger(R.integer.clicks7);
        clicks7_int = sharedPref.getInt(getString(R.string.times7), default7);

        int default8 = getResources().getInteger(R.integer.clicks8);
        clicks8_int = sharedPref.getInt(getString(R.string.times8), default8);

        int default9 = getResources().getInteger(R.integer.clicks9);
        clicks9_int = sharedPref.getInt(getString(R.string.times9), default9);

        int default10 = getResources().getInteger(R.integer.clicks10);
        clicks10_int = sharedPref.getInt(getString(R.string.times10), default10);

        int default11 = getResources().getInteger(R.integer.clicks11);
        clicks11_int = sharedPref.getInt(getString(R.string.times11), default11);

        int default12 = getResources().getInteger(R.integer.clicks12);
        clicks12_int = sharedPref.getInt(getString(R.string.times12), default12);

        int default13 = getResources().getInteger(R.integer.clicks13);
        clicks13_int = sharedPref.getInt(getString(R.string.times13), default13);

        int default14 = getResources().getInteger(R.integer.clicks14);
        clicks14_int = sharedPref.getInt(getString(R.string.times14), default14);

        int default15 = getResources().getInteger(R.integer.clicks15);
        clicks15_int = sharedPref.getInt(getString(R.string.times15), default15);

        int default16 = getResources().getInteger(R.integer.clicks16);
        clicks16_int = sharedPref.getInt(getString(R.string.times16), default16);

        int default17 = getResources().getInteger(R.integer.clicks17);
        clicks17_int = sharedPref.getInt(getString(R.string.times17), default17);

        int default18 = getResources().getInteger(R.integer.clicks18);
        clicks18_int = sharedPref.getInt(getString(R.string.times18), default18);

        int default19 = getResources().getInteger(R.integer.clicks19);
        clicks19_int = sharedPref.getInt(getString(R.string.times19), default19);

        int default20 = getResources().getInteger(R.integer.clicks20);
        clicks20_int = sharedPref.getInt(getString(R.string.times20), default20);


        total.setText("Total Rolls: up " + clicksTotal);
        total1.setText("1's Rolled: up " + clicks1_int);
        total2.setText("2's Rolled: up " + clicks2_int);
        total3.setText("3's Rolled: up " + clicks3_int);
        total4.setText("4's Rolled: up " + clicks4_int);
        total5.setText("5's Rolled: up " + clicks5_int);
        total6.setText("6's Rolled: up " + clicks6_int);
        total7.setText("7's Rolled: up " + clicks7_int);
        total8.setText("8's Rolled: up " + clicks8_int);
        total9.setText("9's Rolled: up " + clicks9_int);
        total10.setText("10's Rolled: up " + clicks10_int);
        total11.setText("11's Rolled: up " + clicks11_int);
        total12.setText("12's Rolled: up " + clicks12_int);
        total13.setText("13's Rolled: up " + clicks13_int);
        total14.setText("14's Rolled: up " + clicks14_int);
        total15.setText("15's Rolled: up " + clicks15_int);
        total16.setText("16's Rolled: up " + clicks16_int);
        total17.setText("17's Rolled: up " + clicks17_int);
        total18.setText("18's Rolled: up " + clicks18_int);
        total19.setText("19's Rolled: up " + clicks19_int);
        total20.setText("20's Rolled: up " + clicks20_int);

        FloatingActionButton floatingActionButton =
                (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
