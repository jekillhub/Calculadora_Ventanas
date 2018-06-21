package com.jekill.calculadora.ventanas;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    EditText altoJ;
    EditText anchoJ;
    RadioButton l15J;
    RadioButton l20J;
    RadioButton l25J;
    RadioGroup botonesJ;
    TextView resultadoJ;
    TextView textoPrecioJ;
    Button calcularJ;
    Calculo calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altoJ = (EditText) findViewById(R.id.alto);
        anchoJ = (EditText) findViewById(R.id.ancho);
        l15J = (RadioButton) findViewById(R.id.l15);
        l20J = (RadioButton) findViewById(R.id.l20);
        l25J = (RadioButton) findViewById(R.id.l25);
        botonesJ = (RadioGroup) findViewById(R.id.botones);
        resultadoJ = (TextView) findViewById(R.id.resultado);
        textoPrecioJ = (TextView) findViewById(R.id.textoPrecio);
        calcularJ = (Button) findViewById(R.id.calcular);

        calc = new Calculo();

    }

    public void onClick(View view) {

        resultadoJ.onEditorAction(EditorInfo.IME_ACTION_DONE);
        resultadoJ.setText("");


        if (altoJ.getText().toString().isEmpty() || anchoJ.getText().toString().isEmpty()) {

            Toast error = Toast.makeText(getApplicationContext(), "Uno o mas campos vacíos", Toast.LENGTH_SHORT);
            error.show();

        } else {

            double alto = Double.parseDouble(altoJ.getText().toString());
            double ancho = Double.parseDouble(anchoJ.getText().toString());

            if (l15J.isChecked()) {

                calc.l15Comprobacion100(alto, ancho);
                resultadoJ.setText(calc.getPrecio());

            }

            if (l20J.isChecked()) {

                calc.l20Comprobacion100(alto, ancho);
                resultadoJ.setText(calc.getPrecio());

            }

            if (l25J.isChecked()) {

                calc.l25Comprobacion100(alto, ancho);
                resultadoJ.setText(calc.getPrecio());

            }
        }
    }
}

