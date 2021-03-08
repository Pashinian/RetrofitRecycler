package com.example.primer.retrofitrecycler;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MiContenedorDeVista> {

    private List<Incidencia> lista = new ArrayList<>();

    public Adaptador(List<Incidencia> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public MiContenedorDeVista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista,parent,false);

        TextView fechaInicio = vista.findViewById(R.id.fechaInicio);
        TextView fechaFin = vista.findViewById(R.id.fechaFin);
        TextView descripcion = vista.findViewById(R.id.descripcion);
        MiContenedorDeVista contenedor = new MiContenedorDeVista(vista);
        return contenedor; 
    }

    @Override
    public void onBindViewHolder(@NonNull MiContenedorDeVista holder, int position) {

        Incidencia i = lista.get(position);
        holder.descripcion.setText(i.getDescripcion());
        holder.fechaFin.setText(i.getFechaFin());
        holder.fechaInicio.setText(i.getFechaInicio());
        Log.d("Contenedor","Vinculado posicion "+position);

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class MiContenedorDeVista extends RecyclerView.ViewHolder{
        public TextView fechaInicio,fechaFin,descripcion;

        public MiContenedorDeVista(View vista) {
            super(vista);
            this.fechaInicio = vista.findViewById(R.id.fechaInicio);
            this.fechaFin = vista.findViewById(R.id.fechaFin);
            this.descripcion = vista.findViewById(R.id.descripcion);
        }


    }
}
