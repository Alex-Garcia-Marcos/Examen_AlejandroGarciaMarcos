package com.example.alex.examen_alejandrogarciamarcos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alex on 12/12/2017.
 */

public class ActivityDetalles extends AppCompatActivity {

    TextView nombreProducto;
    TextView precioProducto;
    TextView idProducto;
    TextView descripcionProducto;
    ImageView imagenProducto;
    Button botonSiguiente;
    Button botonAnterior;

    Producto prod;
    int cont=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vistadetalles);

        nombreProducto = findViewById(R.id.tvNombreProducto);
        precioProducto = findViewById(R.id.tvPrecioProducto);
        idProducto = findViewById(R.id.tvIdProducto);
        descripcionProducto = findViewById(R.id.tvDescripcionProducto);
        imagenProducto = findViewById(R.id.imagenProducto);
        botonAnterior = findViewById(R.id.btnAnterior);
        botonSiguiente = findViewById(R.id.btnPosterior);

        prod = (Producto) getIntent().getExtras().get("producto");

        nombreProducto.setText(prod.getNombreProducto());
        precioProducto.setText((int) prod.getPrecio());
        idProducto.setText(prod.getIdProducto());
        descripcionProducto.setText(prod.getDescripcion());
        imagenProducto.setImageResource(prod.getGaleriaImagenes().get(0));
    }
    public void onClickSiguiente(View view){

        ArrayList<Integer> paso;
    paso=prod.getGaleriaImagenes() ;
    if(cont<paso.size()){
            imagenProducto.setImageResource(paso.get(cont + 1));
            cont++;
        }
    }

    public void onClickAnterior( View view){
        ArrayList<Integer> paso;
        paso=prod.getGaleriaImagenes() ;
        if(cont!=0) {
            imagenProducto.setImageResource(paso.get(cont - 1));
            cont--;
        }
    }



}
