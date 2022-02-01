package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class menuPrincipal extends AppCompatActivity {

   ImageView x1;
   ImageView x2;
    ImageView x3;
    ImageView x4;
    ImageView x5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        x1 =findViewById(R.id.iz);
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.yu = 1;
                startActivity(new Intent(menuPrincipal.this, pantallaInicial.class));
            }
        });

        x2 =findViewById(R.id.iani);
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.yu = 2;
                startActivity(new Intent(menuPrincipal.this, pantallaInicial.class));
            }
        });

        x3 =findViewById(R.id.ip);
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.yu = 3;
                startActivity(new Intent(menuPrincipal.this, pantallaInicial.class));
            }
        });

        x4 =findViewById(R.id.ia);
        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.yu = 4;
                startActivity(new Intent(menuPrincipal.this, pantallaInicial.class));
            }
        });

        x5 =findViewById(R.id.iplan);
        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.yu = 5;
                startActivity(new Intent(menuPrincipal.this, pantallaInicial.class));
            }
        });

    }

}
