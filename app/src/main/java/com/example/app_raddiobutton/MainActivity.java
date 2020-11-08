package com.example.app_raddiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et1 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.tv_status);
        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
    }

    //Metodo para el boton calcular
    public void calcular(View view){
        String num1_string = et1.getText().toString();
        String num2_string = et2.getText().toString();

        int num1_int = Integer.parseInt(num1_string);
        int num2_int = Integer.parseInt(num2_string);

        if(rb1.isChecked()){
            int suma = num1_int+num2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);

        }else if(rb2.isChecked()) {
            int resta = num1_int - num2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }

    }
}