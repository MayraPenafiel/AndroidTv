package com.example.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ActionMenuView;
import android.widget.ImageView;

import com.example.galeria.adapter.GaleriaAdapter;

public class completeImg extends AppCompatActivity {
    ImageView imageView;
    GaleriaAdapter galeriaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_img);
        imageView = (ImageView)findViewById(R.id.imgCompleta);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Complete Picture");
        Intent intent = getIntent();
        int posiscion = intent.getExtras().getInt("Imagenes");
        galeriaAdapter = new GaleriaAdapter(this);
        imageView.setImageResource(galeriaAdapter.imageArray[posiscion]);
    }
}