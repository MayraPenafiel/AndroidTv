package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridView;
import android.widget.ImageView;

import Adaptador.GaleriaAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animacion1= AnimationUtils.loadAnimation( this,R.anim.desplazamiento_arriba);
        ImageView logo_galeria= findViewById(R.id.logo_galeria);
        logo_galeria.setAnimation(animacion1);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                 startActivity(intent);
                 finish();

             }
         }, 3000);

    }

}