package com.example.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.galeria.adaptadores.GaleriaAdaptAnime;
import com.example.galeria.adaptadores.GaleriaAdaptPaisajes;
import com.example.galeria.adaptadores.GaleriaAdaptPlantas;
import com.example.galeria.adaptadores.GaleriaImagenesAdapter;
import com.example.galeria.adaptadores.GaleriaImgAdanimales;

public class ImageFullScreen extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;

    GaleriaImagenesAdapter adap;
    GaleriaAdaptPaisajes pai;
    GaleriaAdaptPlantas plan;
    GaleriaImgAdanimales ani;
    GaleriaAdaptAnime anme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int y=MainActivity.yu;
        int posicion;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_full_screen);
        //boton regreso
        ActionBar acb=getSupportActionBar();
        acb.setTitle("Full Screen Image");

        if(y==1){
            img1 = findViewById(R.id.imagen_detalle);
            //recibir imagen
            Intent i=getIntent();
            posicion = i.getExtras().getInt("idimagen");
            adap= new GaleriaImagenesAdapter(this);
            img1.setImageResource(adap.imgz[posicion]);
        }else if(y==2){
            img2 = findViewById(R.id.imagen_detalle);
            //recibir imagen
            Intent i=getIntent();
            posicion = i.getExtras().getInt("idimagen");
            ani= new GaleriaImgAdanimales(this);
            img2.setImageResource(ani.img[posicion]);
        }else if(y==3){
            img3 = findViewById(R.id.imagen_detalle);
            //recibir imagen
            Intent i=getIntent();
            posicion = i.getExtras().getInt("idimagen");
            pai= new GaleriaAdaptPaisajes(this);
            img3.setImageResource(pai.img[posicion]);
        }else if(y==4){
            img4 = findViewById(R.id.imagen_detalle);
            //recibir imagen
            Intent i=getIntent();
            posicion = i.getExtras().getInt("idimagen");
            anme= new GaleriaAdaptAnime(this);
            img4.setImageResource(anme.img[posicion]);
        }else if(y==5){
            img5 = findViewById(R.id.imagen_detalle);
            //recibir imagen
            Intent i=getIntent();
            posicion = i.getExtras().getInt("idimagen");
            plan= new GaleriaAdaptPlantas(this);
            img5.setImageResource(plan.img[posicion]);
        }

    }
}