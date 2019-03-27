package com.example.dhruvi.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity.*;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class rate_us extends AppCompatActivity {
    RatingBar ratingBar;
    Button Btnrate;
    TextView Txtrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        ratingBar=(RatingBar)findViewById(R.id.rating);
        Btnrate=(Button)findViewById(R.id.Btnrate);
        Txtrate=(TextView) findViewById(R.id.Txtrate);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // Do what you want
                if(rating <= 1.5)
                {
                    Txtrate.setText("Good");
                }
                else if(rating <= 2.5 && rating > 1.5)
                {
                    Txtrate.setText("Better");
                }
                else if(rating <= 3.5 && rating > 2.5)
                {
                    Txtrate.setText("Best");
                }
                else if(rating <= 5 && rating > 3.5)
                {
                    Txtrate.setText("Excellent");
                }
            }
        });
        }

    public void onBtnClick(View view) {

        float ratingvalue = ratingBar.getRating();
        Toast.makeText(getApplicationContext(), "your rate is : "+ratingvalue, Toast.LENGTH_SHORT).show();
    }


}
