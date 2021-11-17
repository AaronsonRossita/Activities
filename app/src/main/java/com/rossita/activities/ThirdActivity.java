package com.rossita.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    Button btnGood, btnBad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnBad = findViewById(R.id.btnBad);
        btnGood = findViewById(R.id.btnGood);

        btnGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(getString(R.string.good),"Good");
                setResult(RESULT_OK,intent);
                ThirdActivity.this.finish();
            }
        });

        btnBad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(getString(R.string.bad),"Bad");
                setResult(RESULT_CANCELED,intent);
                ThirdActivity.this.finish();
            }
        });
    }

}
