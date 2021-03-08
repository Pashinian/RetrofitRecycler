package com.example.primer.retrofitrecycler;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Root(strict = false,name = "Incidencias")
public class Incidencias {
    @ElementList( entry = "Incidencia",name = "Incidencias",inline = true)
    private List<Incidencia> ListaIncidencias = new ArrayList<>();

    public Incidencias(){

    }

    public Incidencias(List<Incidencia> listaIncidencias) {
        this.ListaIncidencias = listaIncidencias;
    }

    public List<Incidencia> getListaIncidencias() {
        return ListaIncidencias;
    }

    public void setListaIncidencias(List<Incidencia> listaIncidencias) {
        this.ListaIncidencias = listaIncidencias;
    }
}
