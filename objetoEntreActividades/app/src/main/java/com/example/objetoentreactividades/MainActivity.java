package com.example.objetoentreactividades;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected EditText miNombre;
    protected EditText miApellido;
    protected EditText miEdad;
    protected Persona p;
    protected Button miBoton;
    protected ImageView miFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miNombre = findViewById(R.id.edNombre);
        miApellido = findViewById(R.id.edApellido);
        miEdad = findViewById(R.id.edEdad);
        miFoto = findViewById(R.id.miFoto);
        miBoton = findViewById(R.id.Btn);
        miBoton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String nom = miNombre.getText().toString();
                String ape = miApellido.getText().toString();
                String ed = miEdad.getText().toString();
                if (TextUtils.isEmpty(ed)) ed = "0";
                p = new Persona(nom, ape, Integer.parseInt(ed), R.drawable.imagenpersona);
                showToast(p.toString());
                Intent miIntent = new Intent(MainActivity.this, Pantalla2.class);
                Bundle miBundle = new Bundle();
                miBundle.putSerializable("CLAVEper", p);
                miIntent.putExtras(miBundle);
                startActivity(miIntent);
            }
        });
    }

    protected void showToast(CharSequence text) {
        
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}