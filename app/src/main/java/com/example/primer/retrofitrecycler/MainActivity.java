package com.example.primer.retrofitrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Actualizar{

    MainActivity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contexto = this;
        AccesoDatos.DatosXML(contexto);

    }

    @Override
    public void recuperarDatos(Incidencias i) {

        List<Incidencia> listaIncidencias = i.getListaIncidencias();
        Log.d("Mensaje",listaIncidencias.toString());

        Adaptador adaptador = new Adaptador(listaIncidencias);
        RecyclerView rec = findViewById(R.id.recycleView);
        RecyclerView.LayoutManager gestor = new LinearLayoutManager(this);

        rec.setLayoutManager(gestor);
        rec.setAdapter(adaptador);


    }
}