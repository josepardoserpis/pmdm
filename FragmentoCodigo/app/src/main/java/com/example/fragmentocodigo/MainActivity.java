package com.example.fragmentocodigo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Fragment mFrg;
    int mStackPosition=1;
    Button manejaFragment;
    int dibujos[]={R.drawable.hielo, R.drawable.increibles, R.drawable.up, R.drawable.superman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manejaFragment=(Button)findViewById(R.id.botonPrueba);
        manejaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment();
            }
        });
        if (savedInstanceState==null){
            Fragment miFragment = Mifragment.newInstance(dibujos[0]);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.miFrg, miFragment);
            ft.commit();
        }else {
            mStackPosition=savedInstanceState.getInt("position");
        }
    }

    public void addFragment(){
        Fragment miFragment;
        Random r = new Random();
        miFragment = MiFragment.newInstance(dibujos[r.nextInt(dibujos.length)]);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.miFrg, miFragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();

    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState){
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("position", mStackPosition);
    }



}
