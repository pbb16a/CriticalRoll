package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
//new
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

import static android.app.PendingIntent.getActivity;
import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textViewNum;
    private TextView textViewHit;
    private Random rng = new Random();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        int defaultTotal= getResources().getInteger(R.integer.clicksTotal);
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

        imageViewDice = findViewById(R.id.image_view_dice);
        textViewNum = findViewById(R.id.text_view_number);
        textViewHit = findViewById(R.id.text_view_hit);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice_roll);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);

        final RotateAnimation rotate = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(500);
        rotate.setInterpolator(new LinearInterpolator());


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);


            }
        });

        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewDice.startAnimation(rotate);
                mp.start();
                textViewNum.setText(R.string.blank);




                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        rollDice();
                        editor.putInt(getString(R.string.timesTotal), clicksTotal);
                        editor.putInt(getString(R.string.times1), clicks1_int);
                        editor.putInt(getString(R.string.times2), clicks2_int);
                        editor.putInt(getString(R.string.times3), clicks3_int);
                        editor.putInt(getString(R.string.times4), clicks4_int);
                        editor.putInt(getString(R.string.times5), clicks5_int);
                        editor.putInt(getString(R.string.times6), clicks6_int);
                        editor.putInt(getString(R.string.times7), clicks7_int);
                        editor.putInt(getString(R.string.times8), clicks8_int);
                        editor.putInt(getString(R.string.times9), clicks9_int);
                        editor.putInt(getString(R.string.times10), clicks10_int);
                        editor.putInt(getString(R.string.times11), clicks11_int);
                        editor.putInt(getString(R.string.times12), clicks12_int);
                        editor.putInt(getString(R.string.times13), clicks13_int);
                        editor.putInt(getString(R.string.times14), clicks14_int);
                        editor.putInt(getString(R.string.times15), clicks15_int);
                        editor.putInt(getString(R.string.times16), clicks16_int);
                        editor.putInt(getString(R.string.times17), clicks17_int);
                        editor.putInt(getString(R.string.times18), clicks18_int);
                        editor.putInt(getString(R.string.times19), clicks19_int);
                        editor.putInt(getString(R.string.times20), clicks20_int);
                        editor.commit();
                    }
                }, 500); // Millisecond 1000 = 1 sec
            }
        });
    }
    private void rollDice() {
        int randomNumeber = rng.nextInt(20) + 1;
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.good);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.bad);

        clicksTotal = clicksTotal + 1;
        switch (randomNumeber) {
            case 1:
                clicks1_int = clicks1_int + 1;
                textViewNum.setText(R.string.one);
                textViewHit.setText(R.string.miss);
                textViewHit.setTextColor(getResources().getColor(R.color.myred, null));

                mp2.start();
                break;
            case 2:
                clicks2_int = clicks2_int + 1;
                textViewNum.setText(R.string.two);
                textViewHit.setText(R.string.blank);
                break;
            case 3:
                clicks3_int = clicks3_int + 1;
                textViewNum.setText(R.string.three);
                textViewHit.setText(R.string.blank);
                break;
            case 4:
                clicks4_int = clicks4_int + 1;
                textViewNum.setText(R.string.four);
                textViewHit.setText(R.string.blank);
                break;
            case 5:
                clicks5_int = clicks5_int + 1;
                textViewNum.setText(R.string.five);
                textViewHit.setText(R.string.blank);
                break;
            case 6:
                clicks6_int = clicks6_int + 1;
                textViewNum.setText(R.string.six);
                textViewHit.setText(R.string.blank);
                break;
            case 7:
                clicks7_int = clicks7_int + 1;
                textViewNum.setText(R.string.seven);
                textViewHit.setText(R.string.blank);
                break;
            case 8:
                clicks8_int = clicks8_int + 1;
                textViewNum.setText(R.string.eight);
                textViewHit.setText(R.string.blank);
                break;
            case 9:
                clicks9_int = clicks9_int + 1;
                textViewNum.setText(R.string.nine);
                textViewHit.setText(R.string.blank);
                break;
            case 10:
                clicks10_int = clicks10_int + 1;
                textViewNum.setText(R.string.ten);
                textViewHit.setText(R.string.blank);
                break;
            case 11:
                clicks11_int = clicks11_int + 1;
                textViewNum.setText(R.string.eleven);
                textViewHit.setText(R.string.blank);
                break;
            case 12:
                clicks12_int = clicks12_int + 1;
                textViewNum.setText(R.string.twelve);
                textViewHit.setText(R.string.blank);
                break;
            case 13:
                clicks13_int = clicks13_int + 1;
                textViewNum.setText(R.string.thirteen);
                textViewHit.setText(R.string.blank);
                break;
            case 14:
                clicks14_int = clicks14_int + 1;
                textViewNum.setText(R.string.fourteen);
                textViewHit.setText(R.string.blank);
                break;
            case 15:
                clicks15_int = clicks15_int + 1;
                textViewNum.setText(R.string.fifteen);
                textViewHit.setText(R.string.blank);
                break;
            case 16:
                clicks16_int = clicks16_int + 1;
                textViewNum.setText(R.string.sixteen);
                textViewHit.setText(R.string.blank);
                break;
            case 17:
                clicks17_int = clicks17_int + 1;
                textViewNum.setText(R.string.seventeen);
                textViewHit.setText(R.string.blank);
                break;
            case 18:
                clicks18_int = clicks18_int + 1;
                textViewNum.setText(R.string.eighteen);
                textViewHit.setText(R.string.blank);
                break;
            case 19:
                clicks19_int = clicks19_int + 1;
                textViewNum.setText(R.string.nineteen);
                textViewHit.setText(R.string.blank);
                break;
            case 20:
                clicks20_int = clicks20_int + 1;
                textViewNum.setText(R.string.twenty);
                textViewHit.setText(R.string.hit);
                textViewHit.setTextColor(getResources().getColor(R.color.mygreen, null));
                mp1.start();
                break;
        }
    }
}