package com.example.primer.retrofitrecycler;

import android.util.Log;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class AccesoDatos {

    static Incidencias inci= null;

    public static Incidencias DatosXML(Actualizar a) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://informo.madrid.es/")
                .addConverterFactory(SimpleXmlConverterFactory.create()).build();

        ServicioIncidencia service = retrofit.create(ServicioIncidencia.class);

        Call<Incidencias> llamada = service.getIncidencias();
        llamada.enqueue(new Callback<Incidencias>() {

            @Override
            public void onResponse(Call<Incidencias> call, Response<Incidencias> response) {
                inci = response.body();
                Log.d("Mensaje",inci.getListaIncidencias().toString());
                a.recuperarDatos(inci);
                // System.out.println(p);

            }

            @Override
            public void onFailure(Call<Incidencias> call, Throwable t) {
                Log.d("Mensaje",t.getLocalizedMessage());
            }
        });
        return inci;
    }
}