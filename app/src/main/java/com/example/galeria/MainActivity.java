package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.galeria.adaptadores.GaleriaImagenesAdapter;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid= findViewById(R.id.grid_view_imagenes);
        grid.setAdapter(new GaleriaImagenesAdapter(this));

    }
}