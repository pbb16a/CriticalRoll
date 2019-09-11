package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
//new
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textViewNum;
    private TextView textViewHit;
    private Random rng = new Random();
//<rotate
//    xmlns:android="imageVeiwDice"
//    android:fromDegrees="0"
//    android:toDegrees="360"
//    android:pivotX="50%"
//    android:pivotY="50%"
//    android:repeatCount="infinite"
//    android:duration="1200" />
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        textViewNum = findViewById(R.id.text_view_number);
        textViewHit = findViewById(R.id.text_view_hit);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice_roll);

        final RotateAnimation rotate = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(500);
        rotate.setInterpolator(new LinearInterpolator());

        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewDice.startAnimation(rotate);
                mp.start();
                textViewNum.setText(R.string.blank);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rollDice();
                    }
                }, 500); // Millisecond 1000 = 1 sec
            }
        });
    }
    private void rollDice() {
        int randomNumeber = rng.nextInt(20) + 1;
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.good);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.bad);


        switch (randomNumeber) {
            case 1:
                textViewNum.setText(R.string.one);
                textViewHit.setText(R.string.miss);
                textViewHit.setTextColor(getResources().getColor(R.color.myred, null));
                mp2.start();
                break;
            case 2:
                textViewNum.setText(R.string.two);
                textViewHit.setText(R.string.blank);
                break;
            case 3:
                textViewNum.setText(R.string.three);
                textViewHit.setText(R.string.blank);
                break;
            case 4:
                textViewNum.setText(R.string.four);
                textViewHit.setText(R.string.blank);
                break;
            case 5:
                textViewNum.setText(R.string.five);
                textViewHit.setText(R.string.blank);
                break;
            case 6:
                textViewNum.setText(R.string.six);
                textViewHit.setText(R.string.blank);
                break;
            case 7:
                textViewNum.setText(R.string.seven);
                textViewHit.setText(R.string.blank);
                break;
            case 8:
                textViewNum.setText(R.string.eight);
                textViewHit.setText(R.string.blank);
                break;
            case 9:
                textViewNum.setText(R.string.nine);
                textViewHit.setText(R.string.blank);
                break;
            case 10:
                textViewNum.setText(R.string.ten);
                textViewHit.setText(R.string.blank);
                break;
            case 11:
                textViewNum.setText(R.string.eleven);
                textViewHit.setText(R.string.blank);
                break;
            case 12:
                textViewNum.setText(R.string.twelve);
                textViewHit.setText(R.string.blank);
                break;
            case 13:
                textViewNum.setText(R.string.thirteen);
                textViewHit.setText(R.string.blank);
                break;
            case 14:
                textViewNum.setText(R.string.fourteen);
                textViewHit.setText(R.string.blank);
                break;
            case 15:
                textViewNum.setText(R.string.fifteen);
                textViewHit.setText(R.string.blank);
                break;
            case 16:
                textViewNum.setText(R.string.sixteen);
                textViewHit.setText(R.string.blank);
                break;
            case 17:
                textViewNum.setText(R.string.seventeen);
                textViewHit.setText(R.string.blank);
                break;
            case 18:
                textViewNum.setText(R.string.eighteen);
                textViewHit.setText(R.string.blank);
                break;
            case 19:
                textViewNum.setText(R.string.nineteen);
                textViewHit.setText(R.string.blank);
                break;
            case 20:
                textViewNum.setText(R.string.twenty);
                textViewHit.setText(R.string.hit);
                textViewHit.setTextColor(getResources().getColor(R.color.mygreen, null));
                mp1.start();
                break;
        }
    }
}