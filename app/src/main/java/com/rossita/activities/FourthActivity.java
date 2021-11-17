package com.rossita.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    Button btnCall, btnGps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        btnCall = findViewById(R.id.btnCall);
        btnGps = findViewById(R.id.btnGps);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int permCall = ActivityCompat.checkSelfPermission(FourthActivity.this, Manifest.permission.CALL_PHONE);
                String[] permissions = {Manifest.permission.CALL_PHONE};
                if (permCall != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(FourthActivity.this,permissions,1);
                    return;
                }
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0546574969"));
                startActivity(intent);
            }
        });

        btnGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 //               startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:?q=Rehovot")));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://nba.com")));
            }
        });


    }
}
