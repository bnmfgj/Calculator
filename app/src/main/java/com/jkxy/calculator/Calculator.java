package com.jkxy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Calculator extends AppCompatActivity {
    private Buttone btnOne,btnTwo,btnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
}
