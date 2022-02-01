package com.example.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.galeria.adaptadores.GaleriaImagenesAdapter;

public class ImagenFullScreen extends AppCompatActivity {

    ImageView img;
    GaleriaImagenesAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_full_screen);
        img = findViewById(R.id.imagen_detalle);
        //boton regreso
        ActionBar acb=getSupportActionBar();
        acb.setTitle("Full Screen Image");
        //recibir imagen
        Intent i=getIntent();
        int posicion = i.getExtras().getInt("idimagen");
        adap= new GaleriaImagenesAdapter(this);
        img.setImageResource(adap.imagenesArray[posicion]);
    }
}