package com.example.dhruvi.project;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.LinearLayout;
import com.example.dhruvi.project.homeScreen.*;

import java.util.Timer;
import java.util.TimerTask;

public class navdrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//    LinearLayout drawer_layout;
        homeScreen home = new homeScreen();
    private static int currentPage = 0;
    private static int NUM_PAGES = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navdrawer);
//        drawer_layout=(LinearLayout)findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navdrawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            // Handle the camera action
            Intent i= new Intent(navdrawer.this,homeScreen.class) ;
            startActivity(i);

            Timer timer;
            int IMAGES[] = {R.drawable.amul_cow_milk, R.drawable.amul_deshi, R.drawable.amul_diamond, R.drawable.amul_gold, R.drawable.amul_shakti, R.drawable.amul_taaza, R.drawable.amul_chaimaza, R.drawable.amul_slim_trim, R.drawable.amul_tea_special};
            final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
            final long PERIOD_MS = 3000;
            home.mViewpager=findViewById(R.id.viewpager);
            home.mViewpager.setAdapter(new CustomPagerAdapter(navdrawer.this, IMAGES));
            home.viewPager();

        } else if (id == R.id.nav_list_of_products) {

        } else if (id == R.id.nav_see_offer) {

        } else if (id == R.id.nav_order_now) {

        } else if (id == R.id.nav_order_history) {

        } else if (id == R.id.nav_signin) {

        }
        else if (id == R.id.nav_signout) {

        }
        else if (id == R.id.nav_contact_us)
        {
            Intent i= new Intent(navdrawer.this,contact_us.class) ;
            startActivity(i);
        }
        else if (id == R.id.nav_feedback) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
