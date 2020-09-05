package com.example.techniciandemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.techniciandemo.Utils.CommonConstants;

public class TechMachineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_machine);
        init();
    }

    private void init() {
        Bundle bundle=getIntent().getExtras();
        String shiftId=bundle.getString(CommonConstants.SHIFT_ID);
    }
}
