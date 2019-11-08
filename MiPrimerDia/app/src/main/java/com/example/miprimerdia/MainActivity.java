package com.example.miprimerdia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer miMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        miMusica = MediaPlayer.create(getApplicationContext(),R.raw.desigual);

        final ToggleButton btnBoton2= (ToggleButton)findViewById(R.id.miTogBtn);

        btnBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnBoton2.isChecked())
                    miMusica.start();
                else
                    miMusica.stop();
            }
        });
    }
}
