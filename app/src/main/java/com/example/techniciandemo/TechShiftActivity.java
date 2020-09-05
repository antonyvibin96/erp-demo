package com.example.techniciandemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.techniciandemo.Utils.CommonConstants;

public class TechShiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_shift);
    }

    public void clickShift(View view) {
        int shiftId=0;
        switch (view.getId()){
            case R.id.tech_shift1:
                shiftId= CommonConstants.SHIFT_ONE;
                break;
            case R.id.tech_shift2:
                shiftId= CommonConstants.SHIFT_TWO;
                break;
            case R.id.tech_shift3:
                shiftId= CommonConstants.SHIFT_THREE;
                break;
        }
        gotoMachineActivity(shiftId);
    }
    public void gotoMachineActivity(int shiftid){
        Intent intent=new Intent(getApplicationContext(),TechMachineActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString(CommonConstants.SHIFT_ID, String.valueOf(shiftid));
        intent.putExtras(bundle);
        intent.putExtra("TEST_VALUE","TEST_STRING");
        startActivity(intent);

    }
}
