package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.galeria.adaptadores.GaleriaAdaptAnime;
import com.example.galeria.adaptadores.GaleriaAdaptPaisajes;
import com.example.galeria.adaptadores.GaleriaAdaptPlantas;
import com.example.galeria.adaptadores.GaleriaImagenesAdapter;
import com.example.galeria.adaptadores.GaleriaImgAdanimales;

public class pantallaInicial extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicial);
        grid= findViewById(R.id.grid_view_imagenes);
        int y=MainActivity.yu;
        if (y == 1) {
            grid.setAdapter(new GaleriaImagenesAdapter(this));
        } else if (y == 2) {
            grid.setAdapter(new GaleriaImgAdanimales(this));
        } else if (y == 3) {
            grid.setAdapter(new GaleriaAdaptPaisajes(this));
        } else if (y == 4) {
            grid.setAdapter(new GaleriaAdaptAnime(this));

        } else if (y == 5) {
            grid.setAdapter(new GaleriaAdaptPlantas(this));
        }
        //Enviar Id de la imagen
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),ImageFullScreen.class);
                //Parametros
                intent.putExtra("idimagen",i);
                startActivity(intent);
            }
        });
    }





}