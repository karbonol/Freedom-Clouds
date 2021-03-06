package com.ndds.freedomclouds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //finish();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        finish();

                        startActivity(new Intent(Splash_Screen.this,MainActivity.class));

                    }
                });


            }
        },1000);
    }

    @Override
    public void finish() {

        super.finish();

    }
}
