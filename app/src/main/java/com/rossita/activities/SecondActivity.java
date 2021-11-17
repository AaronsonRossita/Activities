package com.rossita.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvWelcome;
    String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvWelcome = findViewById(R.id.tvWelcome);
        s = getIntent().getStringExtra(getString(R.string.intentSecond));
        tvWelcome.setText("Welcome " + s + " to the second activity");

    }
}
