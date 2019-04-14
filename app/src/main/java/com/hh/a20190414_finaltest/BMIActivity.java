package com.hh.a20190414_finaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        String bmiFloat =getIntent().putExtra("bmi");

        //산출된 값이 18.5 이하면 저체중, 18.5~23은 정상, 23~25는 과체중, 25~30은 비만, 30이상은 고도비만으로 나누어진다.

        String msg = "";

        if (bmiFloat >= 30){
            msg = "고도비만";
        }else if (bmiFloat >= 25){
            msg = "비만";
        }else if (bmiFloat >= 23){
            msg = "과체중";
        }else if (bmiFloat >= 18.5){
            msg = "정상";
        }else {
            msg = "저체중";
        }



    }
}
