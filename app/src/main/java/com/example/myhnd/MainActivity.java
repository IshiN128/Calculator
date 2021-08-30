package com.example.myhnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //create variables
    private EditText txtinputname;
    private TextView txtoutput;
    private Button btnmyclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare variables
        txtinputname=findViewById(R.id.txtName);
        txtoutput=findViewById(R.id.textViewName);
        btnmyclick=findViewById(R.id.btn_click);

        btnmyclick.setOnClickListener(new View.OnClickListener() {//when i type new V suggest the listner code part
            @Override
            public void onClick(View view) {

                String name;
                name=txtinputname.getText().toString();
                txtoutput.setText(name);
            }
        });

    }
}