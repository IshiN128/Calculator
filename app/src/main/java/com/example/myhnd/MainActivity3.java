package com.example.myhnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Collections;

public class MainActivity3 extends AppCompatActivity {

    private EditText num1,num2;
    private TextView txt_out;
    private Button btn_additon,btn_multi,btn_subtract,btn_divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        txt_out=findViewById(R.id.txt_output);
        btn_additon=findViewById(R.id.btn_add);
        btn_multi=findViewById(R.id.btn_mul);
        btn_subtract=findViewById(R.id.btn_sub);
        btn_divi=findViewById(R.id.btn_div);


        btn_additon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1,number2,answer;
                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                answer=number1+number2;
                txt_out.setText(String.valueOf(answer));
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1,number2,answer;
                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                answer=number1*number2;
                txt_out.setText(String.valueOf(answer));
            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1,number2,answer;
                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                answer=number1-number2;
                txt_out.setText(String.valueOf(answer));
            }
        });
        btn_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1,number2;
                float answer;
                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                answer=number1/number2;
                txt_out.setText(String.valueOf(answer));
            }
        });

    }
}