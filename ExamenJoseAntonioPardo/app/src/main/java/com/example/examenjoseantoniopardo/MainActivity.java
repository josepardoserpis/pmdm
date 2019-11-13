package com.example.examenjoseantoniopardo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int tiposMedio[] = {R.drawable.patinete, R.drawable.bicis, R.drawable.coches};

    private MedioTransporte[] electricos = new MedioTransporte[]{
            new MedioTransporte("skate", "Roxi", "12", R.drawable.skate),
            new MedioTransporte("patinete", "Roxi", "15", R.drawable.patinete),
            new MedioTransporte("monociclo", "Oneil", "18", R.drawable.monociclo1)};

    private MedioTransporte[] bicis = new MedioTransporte[]{
            new MedioTransporte("Paseo", "Orbea", "15", R.drawable.bici1),
            new MedioTransporte("Ciudad", "Cube", "20", R.drawable.bici2),
            new MedioTransporte("Montaña", "Bike", "25", R.drawable.bici3)};

    private MedioTransporte[] coches = new MedioTransporte[]{
            new MedioTransporte("Megane", "Renault", "60", R.drawable.megan1),
            new MedioTransporte("Leon", "Seat", "70", R.drawable.leon3),
            new MedioTransporte("Fiesta", "Ford", "75", R.drawable.fiesta2)};
}
