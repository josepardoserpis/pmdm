package com.example.listasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lview;
    final static String semana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mensaje;

        lview = (ListView) findViewById(R.id.ListView1);

        ArrayAdapter<String> miAdaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,semana);
        lview.setAdapter(miAdaptador);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int position, long id) {

                String mensaje = "";
                mensaje="Item clicked => " + semana[position];
                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();

            }

//        @Override
//                public void onNothingSelected(AdapterView<?> adapterView){
//            }
        });
    }
}
