package com.example.appexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText    etHeight;
    EditText    etWeight;
    Button    btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*etHeight = (EditText)findViewById(R.id.etHeight);
        etWeight = (EditText)findViewById(R.id.etWeight);
        btnCalc = (Button)findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(dados);*/

    }

    /*View.OnClickListener dados = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Float height, weight;
            height = Float.parseFloat(etHeight.getText().toString());
            weight = Float.parseFloat(etWeight.getText().toString());

            Toast.makeText(getBaseContext(), "Você informou " + height + " de altura e " + weight + " de peso.", Toast.LENGTH_SHORT).show();
        }
    };*/


}