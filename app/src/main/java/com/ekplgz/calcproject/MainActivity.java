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
    /*
        Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btnAdd, btnSub, btnMul, btnDivide, btnEql;
        EditText edt;
    */
    //Easy Way To Use
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
    @BindView(R.id.button11) Button btn11;
    @BindView(R.id.button12) Button btn12;
    @BindView(R.id.button13) Button btn13;
    @BindView(R.id.buttonadd) Button btnAdd;
    @BindView(R.id.buttonsub) Button btnSub;
    @BindView(R.id.buttonmul) Button btnMul;
    @BindView(R.id.buttondiv) Button btnDivide;
    @BindView(R.id.buttoneql) Button btnEql;
    @BindView(R.id.edt) EditText edt;


    float firstValue, secondValue, result ;

    final char cAdd = '+';
    final char cSub = '-';
    final char cMult = '*';
    final char cDivide = '/';
    //final char PERCENT = '%';
    char control;
    boolean firstValueControl = false;
    boolean eqlControl = false;
    boolean resultControl = false;
    boolean touchControl = false;



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
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn13 = (Button) findViewById(R.id.button13);
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
                if(eqlControl == false){
                    edt.setText(edt.getText()+"0");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"0");
                    eqlControl =false;

                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"1");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"1");
                    eqlControl =false;

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"2");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"2");
                    eqlControl =false;

                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"3");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"3");
                    eqlControl =false;

                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"4");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"4");
                    eqlControl =false;

                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"5");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"5");
                    eqlControl =false;

                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"6");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"6");
                    eqlControl =false;

                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"7");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"7");
                    eqlControl =false;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"8");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"8");
                    eqlControl =false;

                }
            }
        });



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqlControl == false){
                    edt.setText(edt.getText()+"9");
                }else if(eqlControl == true){
                    edt.setText(null);
                    edt.setText(edt.getText()+"9");
                    eqlControl = false;

                }
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+".");
            }
        });




*/
//Easy way To Use
    }
    @OnClick({R.id.button0,R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button10,R.id.button16})
    public void numButtonClicked(Button numButton){
        //edt.setText(edt.getText() + numButton.getText().toString());
        if(eqlControl == false){
            edt.setText(edt.getText() + numButton.getText().toString());
        }else if(eqlControl == true){
            edt.setText(null);
            edt.setText(edt.getText() + numButton.getText().toString());
            eqlControl =false;

        }
    }

    public void btnPercen(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() + "");
            if(firstValue == 0){
                Toast.makeText(this,"= 0 Olamaz !",Toast.LENGTH_LONG).show();
            }else {

                //edt.setText(null);
                edt.setText((firstValue) / 100 + "");
                //firstValueControl = true;
            }
        }

    }

    public void btnSquare(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() + "");
            edt.setText(firstValue*firstValue + "");
        }

    }

    public void btnSquareRoot(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        }
        else{
            firstValue = Float.parseFloat(edt.getText() + "");
            if(firstValue <= 0){
                Toast.makeText(this,"Sayi Sıfırdan büyük olmali!",Toast.LENGTH_LONG).show();
                edt.setText(null);
            }else {
                edt.setText(Math.sqrt((double) firstValue) + "");
            }
        }


    }


    public void btnAdd(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        }
        else{
            if(firstValueControl == true){
                Toast.makeText(this,"Eşittiri Tıklamalısınız !!", Toast.LENGTH_LONG).show();
// Cant Work Well Here
                /*
                if(resultControl == false) {
                    secondValue = Float.parseFloat(edt.getText() + "");
                    edt.setText(firstValue + secondValue + "");
                    result = firstValue + secondValue;
                    resultControl = true;
                    eqlControl = true;

                }else if(resultControl == true){
                    secondValue = Float.parseFloat(edt.getText() + "");
                    result = result + secondValue;
                    edt.setText( result + "");
                    eqlControl = true;
                }
 */

            }
            else {
                firstValue = Float.parseFloat(edt.getText() + "");
                control = cAdd;
                edt.setText(null);
                firstValueControl = true;
            }
        }
    }

    public void btnSub(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this, "Must Be A Number!",Toast.LENGTH_LONG).show();
        }
        else{

            if(firstValueControl == true){
                Toast.makeText(this,"Eşiitiri Tİkla !", Toast.LENGTH_LONG).show();
                // Cant Work Well Here
           /*     if(resultControl == false) {
                    secondValue = Float.parseFloat(edt.getText() + "");
                    edt.setText(firstValue - secondValue + "");
                    result = firstValue - secondValue;
                    resultControl = true;
                    eqlControl = true;

                }else if(resultControl == true){
                    secondValue = Float.parseFloat(edt.getText() + "");
                    result = result - secondValue;
                    edt.setText( result + "");
                    eqlControl = true;
                }
                */
            }
            else {
                firstValue = Float.parseFloat(edt.getText() + "");
                control = cSub;
                edt.setText(null);
                firstValueControl = true;
            }
        }
    }

    public void btnMultply(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        }
        else{
            if(firstValueControl == true){
                Toast.makeText(this,"Eşittir Tiklayiniz !", Toast.LENGTH_LONG).show();
 //// Cant Work Well Here
                /*
                if(resultControl == false) {
                    secondValue = Float.parseFloat(edt.getText() + "");
                    edt.setText(firstValue * secondValue + "");
                    result = firstValue * secondValue;
                    resultControl = true;
                    eqlControl = true;

                }else if(resultControl == true){
                    secondValue = Float.parseFloat(edt.getText() + "");
                    result = result * secondValue;
                    edt.setText( result + "");
                    eqlControl = true;
                }
                */
            }
            else {
                firstValue = Float.parseFloat(edt.getText() + "");
                control = cMult;
                edt.setText(null);
                firstValueControl = true;
            }
        }
    }

    public void btnDivide(View view) {
        if (edt.getText().toString().matches("")) {
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        } else {
            if (firstValueControl == true) {
                Toast.makeText(this, "Eşittiri tiklayiniz Lütfen!", Toast.LENGTH_LONG).show();
                //// Cant Work Well Here
                /*
                if(resultControl == false) {
                    secondValue = Float.parseFloat(edt.getText() + "");
                    edt.setText(firstValue / secondValue + "");
                    result = firstValue / secondValue;
                    resultControl = true;
                    eqlControl = true;

                }else if(resultControl == true){
                    secondValue = Float.parseFloat(edt.getText() + "");
                    result = result / secondValue;
                    edt.setText( result + "");
                    eqlControl = true;
                }
                */
            } else {
                firstValue = Float.parseFloat(edt.getText() + "");
                control = cDivide;
                edt.setText(null);
                firstValueControl = true;

            }
        }
    }
    public void bttnEql(View view){
        if(edt.getText().toString().matches("")){
            Toast.makeText(this,"Sayı Giriniz!",Toast.LENGTH_LONG).show();
        }
        else {
            secondValue = Float.parseFloat(edt.getText() + "");

            switch (control){
                case cAdd:
                    edt.setText(firstValue + secondValue + "");
                    firstValueControl = false;
                    eqlControl = true;
                    break;
                case cSub:
                    edt.setText(firstValue - secondValue + "");
                    firstValueControl = false;
                    break;
                case cMult:
                    edt.setText(firstValue * secondValue + "");
                    firstValueControl=false;
                    break;
                case cDivide:
                    if (secondValue == 0) {
                        Toast.makeText(this, "Sonsuz!!", Toast.LENGTH_LONG).show();
                    } else {
                        edt.setText(firstValue / secondValue + "");
                        firstValueControl=false;
                    }
                    break;
               /* case PERCENT:
                    edt.setText((firstValue)/100 + "");
                    firstValueControl = false;
                    break;
                */
            }
            eqlControl =true;
        }
    }

    public void btnClear(View view){
        edt.setText("");
        firstValue = 0;
        secondValue = 0;
        //result = 0;
        eqlControl = false;

    }

}