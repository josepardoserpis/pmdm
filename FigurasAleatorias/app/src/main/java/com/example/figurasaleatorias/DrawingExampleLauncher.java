package com.example.figurasaleatorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DrawingExampleLauncher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_example_launcher);
    }

    public void launchDrawShapes1(view clickedButton){

        Intent activityIntent = new Intent(this, DrawShapes1.class);
        startActivity(activityIntent);
    }

    public  void launchDrawShapes2(view clickedButton){

        Intent activityIntent = new Intent(this, DrawShapes2.class);
        startActivity(activityIntent);
    }
}
