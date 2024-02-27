package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Calcu;
    TextView Result;
    Button Add;
    Button Subtract;
    Button Multiply;
    Button Divide;
    EditText ViewResult;
    EditText Num1;
    EditText Num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcu = (TextView)findViewById(R.id.txtvwCalcu);
        Result = (TextView) findViewById(R.id.txtvwResult);
        Add = (Button) findViewById(R.id.btnAdd);
        Subtract = (Button) findViewById(R.id.btnSubtract);
        Multiply = (Button) findViewById(R.id.btnMultiply);
        Divide = (Button) findViewById(R.id.btnDivide);
        ViewResult = (EditText) findViewById(R.id.editxtResult);
        Num1 = (EditText) findViewById(R.id.editxtNo1);
        Num2 = (EditText) findViewById(R.id.editxtNo2);

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double No1 = Double.parseDouble(Num1.getText().toString());
                double No2 = Double.parseDouble(Num2.getText().toString());
                double quotient = No1 / No2;
                ViewResult.setText(String.valueOf(quotient));
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double No1 = Double.parseDouble(Num1.getText().toString());
                double No2 = Double.parseDouble(Num2.getText().toString());
                double product = No1 * No2;
                ViewResult.setText(String.valueOf(product));
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double No1 = Double.parseDouble(Num1.getText().toString());
                double No2 = Double.parseDouble(Num2.getText().toString());
                double diff = No1 - No2;
                ViewResult.setText(String.valueOf(diff));
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double No1 = Double.parseDouble(Num1.getText().toString());
                double No2 = Double.parseDouble(Num2.getText().toString());
                double sum = No1 + No2;
                ViewResult.setText(String.valueOf(sum));
            }
        });
    }
}