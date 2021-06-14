package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View ;

import android.widget.Button ;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_all_clear , btn_percentile , btn_clear, btn_divide , btn_7 , btn_8 , btn_9 ,
           btn_multiplication , btn_4 , btn_5 , btn_6 , btn_subtraction , btn_1 , btn_2,
           btn_3 , btn_addition , btn_00 , btn_0 , btn_decimal_point , btn_equals_to;
    EditText siriusEditText;

    float mValueOne, mValueTwo;

    boolean siriusAddition, mSubtract, siriusMultiplication, siriusDivision , siriuspercentile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_all_clear= (Button) findViewById(R.id.btn_all_clear);
        btn_percentile= (Button) findViewById(R.id.btn_percentile);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_divide  = (Button) findViewById(R.id.btn_divide );
        btn_7= (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id. btn_8);
        btn_9 = (Button) findViewById(R.id. btn_9);
        btn_multiplication  = (Button) findViewById(R.id.btn_multiplication );
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_subtraction  = (Button) findViewById(R.id. btn_subtraction );
        btn_1  = (Button) findViewById(R.id.btn_1 );
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_addition = (Button) findViewById(R.id.btn_addition);
        btn_00 = (Button) findViewById(R.id.btn_00);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_decimal_point = (Button) findViewById(R.id.btn_decimal_point);
        btn_equals_to = (Button) findViewById(R.id.btn_equals_to);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "0");
            }
        });

        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + "00");
            }
        });

        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (siriusEditText == null) {
                    siriusEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(siriusEditText.getText() + "");
                    siriusAddition = true;
                    siriusEditText.setText(null);
                }
            }
        });

        btn_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(siriusEditText.getText() + "");
                mSubtract = true;
                siriusEditText.setText(null);
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(siriusEditText.getText() + "");
                siriusMultiplication = true;
                siriusEditText.setText(null);
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(siriusEditText.getText() + "");
                siriusDivision = true;
                siriusEditText.setText(null);
            }
        });

        btn_percentile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(siriusEditText.getText() + "");
                siriuspercentile = true;
                siriusEditText.setText(null);
            }
        });

        btn_equals_to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(siriusEditText.getText() + "");

                if (siriusAddition == true) {
                    siriusEditText.setText(mValueOne + mValueTwo + "");
                    siriusAddition = false;
                }

                if (mSubtract == true) {
                    siriusEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (siriusMultiplication == true) {
                    siriusEditText.setText(mValueOne * mValueTwo + "");
                    siriusMultiplication = false;
                }

                if (siriusDivision == true) {
                    siriusEditText.setText(mValueOne / mValueTwo + "");
                    siriusDivision = false;
                }


                if (siriuspercentile == true) {
                    siriusEditText.setText(mValueOne % mValueTwo + "");
                    siriuspercentile = false;
                }

            }
        });

        btn_all_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText("");
            }
        });

        btn_decimal_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siriusEditText.setText(siriusEditText.getText() + ".");
            }
        });
    }
}

