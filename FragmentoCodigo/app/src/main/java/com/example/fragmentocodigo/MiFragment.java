package com.example.fragmentocodigo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class MiFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private int mParam1;

    public MiFragment(){

    }
    public static MiFragment newInstante(int param1){
        MiFragment fragment = new MiFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (getArguments() !=null){
            mParam1 = getArguments().getInt(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v= inflater.inflate(R.layout.fragment_mi, container, false);
        ImageView miFoto = (ImageView) v.findViewById(R.id.imagen);
        miFoto.setImageResource(mParam1);
        return v;
    }

}
