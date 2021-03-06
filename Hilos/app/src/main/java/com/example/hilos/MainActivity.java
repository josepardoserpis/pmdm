package com.example.hilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText) findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);
    }

    public void calcularOperacion(View View){
        int n =Integer.parseInt(entrada.getText().toString());
        salida.append(n + "! = ");

        MiThread thread = new MiThread(n);
        thread.start();
    }
    public int factorial(int n){
        int res=1;

        for (int i = 1; i<=n; i++){
            res*=i;
            SystemClock.sleep(1000);
        }
        return res;
    }
    class MiThread extends Thread{
        private int n, res;
        public MiThread (int n){
            this.n = n;
        }
        public void run(){
            res=factorial(n);
            salida.append(String.valueOf(res));
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    salida.append(res + "\n");
                }
            });
        }
    }
}
