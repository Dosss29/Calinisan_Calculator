package com.example.calinisan_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText txtVariable1, txtVariable2;
    Button btnAdd, btnSubtract, btnMultiply, btnModulo, btnDivide;
    TextView txtAnswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVariable1 = findViewById(R.id.txtVariable1);
        txtVariable2 = findViewById(R.id.txtVariable2);


        btnAdd = findViewById(R.id.btnAdd);
        btnDivide = findViewById(R.id.btnDivide);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnModulo = findViewById(R.id.btnModulo);
        txtAnswer = findViewById(R.id.txtAnswer);

        btnAdd.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

    }


    @Override

    public void onClick(View v) {

        double variable1, variable2, answer;

        variable1 = Double.parseDouble(String.valueOf(txtVariable1.getText()));
        variable2 = Double.parseDouble(String.valueOf(txtVariable1.getText()));




        switch (v.getId()) {

            case R.id.btnAdd:
                //code
                answer = variable1 + variable2;
                txtAnswer.setText(String.valueOf(answer));


                break;
            case R.id.btnSubtract:
                answer = variable1 - variable2;
                txtAnswer.setText(String.valueOf(answer));

                break;
            case R.id.btnDivide:
                answer = variable1 / variable2;
                txtAnswer.setText(String.valueOf(answer));

                break;
            case R.id.btnMultiply:
                answer = variable1 * variable2;
                txtAnswer.setText(String.valueOf(answer));

                break;
            case R.id.btnModulo:
                answer = variable1 % variable2;
                txtAnswer.setText(String.valueOf(answer));

                break;


        }

    }
}