package com.example.figurasaleatorias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class DrawShapes1 extends AppCompatActivity {

    RandomShapeView mDrawingArea;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_shapes1);

        mDrawingArea = findViewById(R.id.drawing_area);


    }
    public void redraw(View clickedButton){

        mDrawingArea.invalidate();
    }
}
