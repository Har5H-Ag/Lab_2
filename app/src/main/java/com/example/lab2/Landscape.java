package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Landscape extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscape);
        button = findViewById(R.id.button);
    }

    public void onClick1(View v) {
        Intent i = new Intent(Landscape.this, MainActivity.class);
        startActivity(i);
    }
}