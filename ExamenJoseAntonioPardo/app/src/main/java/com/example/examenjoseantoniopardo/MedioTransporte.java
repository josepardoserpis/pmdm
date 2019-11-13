package com.example.examenjoseantoniopardo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
public class MedioTransporte extends AppCompatActivity {

    Spinner eligeModelo = findViewById(R.id.spinnerBici);

    private String modelo;
    private String marca;
    private String precio;
    private int img;

    final static int biciSelected[]= {R.drawable.bici1,R.drawable.bici2,R.drawable.bici3};

    final static int patineteSelected[]={R.drawable.patinete,R.drawable.monociclo1,R.drawable.monociclo2};

    final static int cocheSelected[]={R.drawable.megan1,R.drawable.fiesta2,R.drawable.leon3};

    public  MedioTransporte(String modelo, String marca, String precio, int img){

        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.img = img;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medio_transporte);
    }


    
    
}
