package com.example.alex.examen_alejandrogarciamarcos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Producto> listaProductos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos= findViewById(R.id.lsDatos);
        listaProductos= new ArrayList<Producto>();

        ArrayList<Integer>galeriaTelevisor= new ArrayList<Integer>();
        ArrayList<Integer>galeriaMicrocadena= new ArrayList<Integer>();
        ArrayList<Integer>galeriaPlancha= new ArrayList<Integer>();
        ArrayList<Integer>galeriaOrdenador= new ArrayList<Integer>();

        galeriaTelevisor.add(R.drawable.galeria_tv1);
        galeriaTelevisor.add(R.drawable.galeria_tv2);
        galeriaTelevisor.add(R.drawable.galeria_tv3);

        galeriaMicrocadena.add(R.drawable.galeria_microcadena1);
        galeriaMicrocadena.add(R.drawable.galeria_microcadena2);
        galeriaMicrocadena.add(R.drawable.galeria_microcadena3);

        galeriaPlancha.add(R.drawable.galeria_plancha1);
        galeriaPlancha.add(R.drawable.galeria_plancha2);
        galeriaPlancha.add(R.drawable.galeria_plancha3);

        galeriaOrdenador.add(R.drawable.galeria_portatil1);
        galeriaOrdenador.add(R.drawable.galeria_portatil2);
        galeriaOrdenador.add(R.drawable.galeria_portatil3);
        galeriaOrdenador.add(R.drawable.galeria_portatil4);




        listaProductos.add(new Producto(1, "Televisor LG F21-40",R.drawable.televisor_lg , 399,  "Televisor imagen 4K de 40 pulgadas 400Mhz",galeriaTelevisor));
        listaProductos.add(new Producto(2, "Microcadena Sony HT-100sd",R.drawable.minicadena_sony , 199, "Cadena musical conexión USB y iPod 40W", galeriaMicrocadena));
        listaProductos.add(new Producto(3, "Plancha Rowenta Soft FX-1",R.drawable.plancha_rowenta ,90, "Plancha profesional 7 funciones de planchado 1800W", galeriaPlancha));
        listaProductos.add(new Producto(4, "Ordenador Portatil Acer R235",R.drawable.portatil_acer , 589.90, "Ordenador Portatil Acer I5, 8GB, SSD240GB",galeriaOrdenador));

        Adaptador adaptador = new Adaptador(this,listaProductos);

        listaDatos.setAdapter(adaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Producto prod= (Producto) adapterView.getItemAtPosition(i);
                Intent intent= new Intent(getApplicationContext(), ActivityDetalles.class);

                intent.putExtra("producto",prod);

                startActivity(intent);
            }
        });


    }
}
