package com.example.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import android.os.Bundle;
import com.example.galeria.adaptador.GaleriaAfotosAdapter;

public class full_image extends AppCompatActivity {

    ImageView imageView;
    GaleriaAfotosAdapter galeriaFotosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        imageView = (ImageView)findViewById(R.id.iv_foto);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Foto Completa");

        Intent intent = getIntent();
        int posicion = intent.getExtras().getInt("misImagenes");
        galeriaFotosAdapter = new GaleriaAfotosAdapter(this);
        imageView.setImageResource(galeriaFotosAdapter.imageArray[posicion]);

    }
}