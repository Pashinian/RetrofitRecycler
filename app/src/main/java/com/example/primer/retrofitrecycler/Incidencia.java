package com.example.primer.retrofitrecycler;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false,name = "Incidencia")
public class Incidencia {
    @Element(name = "fh_inicio", required = false)
    private String fechaInicio;
    @Element(name = "fh_final", required = false)
    private String fechaFin;
    @Element(name = "descripcion", required = false)
    private String descripcion;

    public Incidencia(String fechaInicio, String fechaFin, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    public Incidencia(){

    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}