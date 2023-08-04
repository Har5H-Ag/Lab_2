package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.view.View;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        new Handler().postDelayed(() -> {
            progressBar.setVisibility(View.GONE);
            Intent i = new Intent(Splash.this, MainActivity.class);
            startActivity(i);
            finish();
        }, SPLASH_DURATION);
    }
}