package com.example.objetoentreactividades;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla2 extends AppCompatActivity {
    protected TextView miNom;
    protected TextView miApe;
    protected TextView miEd;
    protected ImageView mifoto;
    protected TextView datosPersona;
    protected Persona per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        miNom = findViewById(R.id.campoNom);
        miApe = findViewById(R.id.campoApe);
        miEd = findViewById(R.id.campoEd);
        mifoto = findViewById(R.id.campoFoto);
        datosPersona = findViewById(R.id.todaPersona);

        per = (Persona) getIntent().getSerializableExtra("CLAVEper");
        datosPersona.setText(per.toString());
//        Toast.makeText(this, per.toString(), Toast.LENGTH_LONG).show();

        miNom.setText("NOMBRE: " + per.getNombre());
        miApe.setText("APELLIDO: " + per.getApellido());
        miEd.setText("EDAD: " + per.getEdad());
        mifoto.setImageResource(per.getFoto());
    }
}