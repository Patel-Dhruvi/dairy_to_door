package com.example.dhruvi.project.Animation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dhruvi.project.MainActivity;
import com.example.dhruvi.project.R;
import com.example.dhruvi.project.navdrawer;

public class splashScreen extends AppCompatActivity {
 private final int SPLASH_TIME_OUT = 3000;
    Animation animation;
    Animation getAnimation;
    ImageView imgTruck;
    TextView txtD2D;
    boolean mMoving=false;
    boolean mBlinking =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imgTruck=(ImageView)findViewById(R.id.imgTruck);
        txtD2D=(TextView)findViewById(R.id.txtD2D);


        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imgTruck.startAnimation(animation);
        animation.getRepeatMode();
        getAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        txtD2D.startAnimation(getAnimation);
//        Thread mythraed = new Thread(){
//            @Override
//            public void run() {
//                try {
//                    sleep(3000);
//                    Intent intent = new Intent(getApplicationContext(),navdrawer.class);
//                    startActivity(intent);
//                    finish();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        mythraed.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(splashScreen.this,navdrawer.class);
                startActivity(i);
                finish();
            }
        },(SPLASH_TIME_OUT));

    }
}
