package com.jkxy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Calculator extends AppCompatActivity {
    private Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
}
