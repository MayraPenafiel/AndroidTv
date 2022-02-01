package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import Adaptador.GaleriaAdapter;

public class MainActivity2 extends AppCompatActivity {

    GridView gridImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridImagenes = findViewById(R.id.gridview);
        gridImagenes.setAdapter(new GaleriaAdapter(this));
    }
}