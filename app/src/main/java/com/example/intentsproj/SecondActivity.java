package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    TextView summation;

    String num1;
    String num2;
    int no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        summation = findViewById(R.id.summation);

        Intent intent = getIntent();
        num1 = intent.getStringExtra("no1");
        num2 = intent.getStringExtra("no2");

        etNum1.setText(num1);
        etNum2.setText(num2);

        no1 = Integer.parseInt(num1);
        no2 = Integer.parseInt(num2);
    }

    public void addition(View view){
        summation.setText(num1 + " + " + num2 + " = " + (no1+no2));
    }

    public void substraction(View view){
        summation.setText(num1 + " - " + num2 + " = " + (no1-no2));
    }

    public void multiplication(View view){
        summation.setText(num1 + " x " + num2 + " = " + (no1*no2));
    }

    public void divide(View view){
        summation.setText(num1 + " / " + num2 + " = " + (no1/no2));
    }
}