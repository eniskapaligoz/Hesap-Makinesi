package com.ekplgz.calcproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    boolean addValue, subValue, multplyValue, divideValue;
    float firstValue, secondValue;

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
    @BindView(R.id.buttonC) Button btnClear;
    @BindView(R.id.buttoneql) Button btnEqual;
    @BindView(R.id.edt) EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button0,R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button10})
    public void numButtonClicked(Button numButton){
        editText.setText(editText.getText() + numButton.getText().toString());
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