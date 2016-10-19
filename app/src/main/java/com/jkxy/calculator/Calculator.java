package com.jkxy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNight, btnZero, btnMul, btnAdd, btnMinus, btnDiv, btnEqu, btnC;
    private EditText inPut;
    //清空标识
    boolean clear_flag;

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
        inPut = (EditText) findViewById(R.id.editText);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNight.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEqu.setOnClickListener(this);
        btnC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str = inPut.getText().toString();
        switch (v.getId()) {
            case R.id.btnOne:
            case R.id.btnTwo:
            case R.id.btnThree:
            case R.id.btnFour:
            case R.id.btnFive:
            case R.id.btnSix:
            case R.id.btnSeven:
            case R.id.btnEight:
            case R.id.btnNine:
            case R.id.btnZero:
                if(clear_flag){
                    inPut.setText("");
                    clear_flag=false;
                }
                inPut.setText(str + ((Button) v).getText());
                break;
            case R.id.add:
            case R.id.minus:
            case R.id.mul:
            case R.id.div:
                inPut.setText(str + " " + ((Button) v).getText() + " ");
                break;
            case R.id.clear:
                inPut.setText("");
                break;
            case R.id.equ:
                getResult();
                break;
        }
    }

    //进行运算
    public void getResult() {
        String s = inPut.getText().toString();
        if (s == null || s.equals("")) {
            return;
        }
        if (!s.contains(" ")) {
            return;
        }
        if(clear_flag){
            clear_flag=false;
        }
        clear_flag = true;
        double result = 0;
        //运算符前的数字
        String s1 = s.substring(0, s.indexOf(' '));
        //运算符
        String op = s.substring(s.indexOf(' ') + 1, s.indexOf(" ") + 2);
        //运算符后的数字
        String s2 = s.substring(s.indexOf(" ") + 3);
        if (!s1.equals("") && !s2.equals("")) {

            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = d1 + d2;
            } else if (op.equals("-")) {
                result = d1 - d2;
            } else if (op.equals("*")) {
                result = d1 * d2;
            } else if (op.equals("/")) {
                if (d2 == 0) {
                    Toast.makeText(Calculator.this, "分母不能为零", Toast.LENGTH_SHORT).show();
                } else {
                    result = d1 / d2;
                }
            }
            inPut.setText(result + "");
            System.out.println(clear_flag);
        }

    }

}
