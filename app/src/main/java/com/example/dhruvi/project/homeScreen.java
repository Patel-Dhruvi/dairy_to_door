package com.example.dhruvi.project;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class homeScreen extends AppCompatActivity {
    ViewPager mViewpager;
    TextView textCartItemCount;
    int mCartItemCount = 1;


    private static int currentPage = 0;
    private static int NUM_PAGES = 9;
    Timer timer;
    int IMAGES[] = {R.drawable.amul_cow_milk, R.drawable.amul_deshi, R.drawable.amul_diamond, R.drawable.amul_gold, R.drawable.amul_shakti, R.drawable.amul_taaza, R.drawable.amul_chaimaza, R.drawable.amul_slim_trim, R.drawable.amul_tea_special};
    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        viewPager();
        mViewpager = (ViewPager) findViewById(R.id.viewpager);
        mViewpager.setAdapter(new CustomPagerAdapter(homeScreen.this, IMAGES));


    }

    public void viewPager() {
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mViewpager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled

            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);

    }


}