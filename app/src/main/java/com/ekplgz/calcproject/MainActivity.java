package com.ekplgz.calcproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean addValue, subValue, multplyValue, divideValue;
    float firstValue, secondValue;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDivide;
    Button btnClear;
    Button btnEqual;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btnAdd = (Button) findViewById(R.id.buttonadd);
        btnSub = (Button) findViewById(R.id.buttonsub);
        btnMul = (Button) findViewById(R.id.buttonmul);
        btnDivide = (Button) findViewById(R.id.buttondiv);
        btnClear = (Button) findViewById(R.id.buttonC);
        btnEqual = (Button) findViewById(R.id.buttoneql);
        editText = (EditText) findViewById(R.id.edt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });



        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });


    }

    public void buttonAdd(View view){

        if (editText.getText().toString().matches("")) {
            Toast.makeText(this,"Must Be A Number !",Toast.LENGTH_LONG).show();
        } else {
            firstValue = Float.parseFloat(editText.getText() + "");
            addValue = true;
            editText.setText(null);
        }
    }


    public void setButtonEql(View view){
        secondValue = Float.parseFloat(editText.getText() + "");

        if (addValue == true) {
            editText.setText(firstValue + secondValue + "");
            addValue = false;
        }

        if (subValue == true) {
            editText.setText(firstValue - secondValue + "");
            subValue = false;
        }

        if (multplyValue == true) {
            editText.setText(firstValue * secondValue + "");
            multplyValue = false;
        }

        if (divideValue == true) {
            editText.setText(firstValue / secondValue + "");
            divideValue = false;
        }
    }

    public void btnSub(View view){
        if (editText.getText().toString().matches("")) {
            Toast.makeText(this,"Must Be A Number !",Toast.LENGTH_LONG).show();
        }else {firstValue = Float.parseFloat(editText.getText() + "");
        subValue = true;
        editText.setText(null);}
    }

    public void btnMult(View view){
        firstValue = Float.parseFloat(editText.getText() + "");
        multplyValue = true;
        editText.setText(null);
    }

    public void btnDivide(View view){
        firstValue = Float.parseFloat(editText.getText() + "");
        divideValue = true;
        editText.setText(null);
    }
    public void btnClear(View view){
        editText.setText("");
    }

}


