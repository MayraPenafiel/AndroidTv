package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.galeria.adaptadores.GaleriaImagenesAdapter;

public class pantallaInicial extends AppCompatActivity {
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicial);

        grid= findViewById(R.id.grid_view_imagenes);
        grid.setAdapter(new GaleriaImagenesAdapter(this));

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