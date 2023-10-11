package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button button2;
    private Button button30;
    private EditText editText1;
    private EditText editText2;
    private TextView textView6;

    private TextView textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button2 = findViewById(R.id.button2);
        textView6 = findViewById(R.id.textView6);
        textView10 = findViewById(R.id.textView10);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText1.getText().toString();
                float a = Float.parseFloat(s);
                String p = editText2.getText().toString();
                float b = Float.parseFloat(p);

                float c = a/100;
                float d = c*c;
                float e = (b/d);
                textView6.setText("BMI : "+ e);
                if(e<18.5){
                    textView10.setText("Weight Status : Underweight");
                }else if(e>= 18.5 && e<=24.9){
                    textView10.setText("Weight Status : Healthy Weight");
                }else if(e>=25.0 && e<=29.9){
                    textView10.setText("Weight Status : Overweight");
                }else{
                    textView10.setText("Weight Status : Obesity");
                }
            }
        });
    }

    public void next1(View v){
        button30 = findViewById(R.id.button30);
        Intent intents = new Intent(this,MainActivity3.class);
        startActivity(intents);
    }

}
