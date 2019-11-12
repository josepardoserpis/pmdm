package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchDrawShapes1(View clickedButton){
        Intent activityIntet = new Intent(this,DrawShapes1.class);
        startActivity(activityIntet);
    }

    public void launchDrawShapes2(View clickedButton){

    }
}
