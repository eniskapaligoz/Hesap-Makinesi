package com.ekplgz.calcproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//with butterknife
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btnAdd, btnSub, btnMul, btnDivide, btnEql;
    //EditText edt;


    @BindView(R.id.button0) Button btn0;
    @BindView(R.id.button1) Button btn1;
    @BindView(R.id.button2) Button btn2;
    @BindView(R.id.button3) Button btn3;
    @BindView(R.id.button4) Button btn4;
    @BindView(R.id.button5) Button btn5;
    @BindView(R.id.button6) Button btn6;
    @BindView(R.id.button7) Button btn7;
    @BindView(R.id.button8) Button btn8;
    @BindView(R.id.button9) Button btn9;
    @BindView(R.id.button10) Button btn10;
    @BindView(R.id.buttonadd) Button btnAdd;
    @BindView(R.id.buttonsub) Button btnSub;
    @BindView(R.id.buttonmul) Button btnMul;
    @BindView(R.id.buttondiv) Button btnDivide;
    @BindView(R.id.buttoneql) Button btnEql;
    @BindView(R.id.edt) EditText edt;



    float firstValue, secondValue;
    boolean addValue, subValue, multiplyValue, divideValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        /*
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
        btnEql = (Button) findViewById(R.id.buttoneql);
        edt = (EditText) findViewById(R.id.edt);
        */

       /*
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"9");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+".");
            }
        });
    */

    }

    @OnClick({R.id.button0,R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button10})
    public void numButtonClicked(Button numButton){
        edt.setText(edt.getText() + numButton.getText().toString());
    }


    public void btnAdd(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Must Be A Number!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() + "");
            addValue = true;
            edt.setText(null);
        }
    }

    public void btnSub(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this, "Must Be A Number!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() + "");
            subValue = true;
            edt.setText(null);
        }
    }

    public void btnMultply(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Must Be A Number!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() +"");
            multiplyValue = true;
            edt.setText(null);
        }
    }

    public void btnDivide(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Must Be A Number!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() + "");
            divideValue = true;
            edt.setText(null);
        }
    }

    public void bttnEql(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Must Be A Number!",Toast.LENGTH_LONG).show();
        }
        else {

            secondValue = Float.parseFloat(edt.getText() + "");

         if (addValue == true) {
                edt.setText(firstValue + secondValue + "");
                addValue = false;
            } else if (subValue == true) {
                edt.setText(firstValue - secondValue + "");
                subValue = false;
            } else if (multiplyValue == true) {
                edt.setText(firstValue * secondValue + "");
                multiplyValue = false;
            } else if (divideValue == true) {
                if (secondValue == 0) {
                    Toast.makeText(this, "Sonsuz!!", Toast.LENGTH_LONG).show();
                } else {
                    edt.setText(firstValue / secondValue + "");
                }
                divideValue = false;
            }
        }
    }

    public void btnClear(View view){
        edt.setText("");
    }

    }

