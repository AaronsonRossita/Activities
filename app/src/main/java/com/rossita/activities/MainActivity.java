package com.rossita.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSecond, btnThird, btnFourth;
    TextView tvName;
    EditText etSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecond = findViewById(R.id.btnSecond);
        btnThird = findViewById(R.id.btnThird);
        btnFourth = findViewById(R.id.btnFourth);
        tvName = findViewById(R.id.tvName);
        etSecond = findViewById(R.id.etSecond);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = etSecond.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(getString(R.string.intentSecond),s);
                startActivity(intent);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivityForResult(intent,3);
            }
        });

        btnFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FourthActivity.class));
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 3){
            if (resultCode == RESULT_OK){
                tvName.setText(data.getStringExtra(getString(R.string.good)));
            }else{
                tvName.setText(data.getStringExtra(getString(R.string.bad)));
            }
        }
    }
}
