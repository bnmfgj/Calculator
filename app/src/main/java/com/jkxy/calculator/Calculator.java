package com.jkxy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven,btnEight,btnNight,btnZero,btnMul,btnAdd,btnMinus,btnDiv,btnEqu,btnC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        InitView();

    }

    public void InitView() {
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNight = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnMinus = (Button) findViewById(R.id.minus);
        btnMul = (Button) findViewById(R.id.mul);
        btnAdd = (Button) findViewById(R.id.add);
        btnEqu = (Button) findViewById(R.id.equ);
        btnDiv = (Button) findViewById(R.id.div);
        btnC = (Button) findViewById(R.id.clear);
    }

    @Override
    public void onClick(View v) {

    }
}
