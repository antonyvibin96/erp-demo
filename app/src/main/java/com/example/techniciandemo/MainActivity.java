package com.example.techniciandemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickProduction(View view) {
        Intent intent=new Intent(getApplicationContext(),TechShiftActivity.class);
        startActivity(intent);
    }

    public void clickQuality(View view) {
        Intent intent=new Intent(getApplicationContext(),TechQualityActivity.class);
        startActivity(intent);
    }
}
