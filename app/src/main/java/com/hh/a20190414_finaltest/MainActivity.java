package com.hh.a20190414_finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText keyEdt;
    EditText weightEdt;
    Button okBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keyEdt = findViewById(R.id.keyEdt);
        weightEdt = findViewById(R.id.weightEdt);
        okBtn = findViewById(R.id.okBtn);

        final Intent intent = new Intent(MainActivity.this, BMIActivity.class);


        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m))이다.
                float floatWeight=Float.valueOf(weightEdt.getText().toString());
                float floatKey = Float.valueOf(keyEdt.getText().toString());
                float floatBmi = floatWeight / (floatKey * floatKey);

                intent.putExtra("bmi", floatBmi);
                startActivity(intent);



                Log.e("keyEdtType",String.valueOf(floatBmi));




            }
        });


    }
}
