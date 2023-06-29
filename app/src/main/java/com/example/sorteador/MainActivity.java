package com.example.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Jogar(View view){

        TextView textResultado;

        textResultado = findViewById(R.id.TextResultado);

        int numero = new Random().nextInt(16);


        textResultado.setText("Número Sorteado: " + numero);
    }
}