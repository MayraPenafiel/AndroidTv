package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.galeria.adaptador.GaleriaFotosAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}

    public void irActivity2( View view){
        //creo el enlace con el segundo activity
        Intent intent = new Intent(this,GaleriaZapatos.class);
        //iniciamos la siguiente activity
        startActivity(intent);

    }
}