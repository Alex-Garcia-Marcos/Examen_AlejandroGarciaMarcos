package com.example.alex.examen_alejandrogarciamarcos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 12/12/2017.
 */

public class Adaptador extends BaseAdapter {
    Context contexto;
    ArrayList<Producto> listaObjetos;

    public Adaptador(Context contexto, ArrayList<Producto> listaObjetos) {
        this.contexto = contexto;
        this.listaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = view;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.listviewitem,null);


        ImageView imagen=vista.findViewById(R.id.imgv);
        TextView titulo=vista.findViewById(R.id.tvTitulo);
        TextView descripcion=vista.findViewById(R.id.tvDescripcion);
        TextView precio=vista.findViewById(R.id.tvPrecio);

        titulo.setText(listaObjetos.get(i).getNombreProducto());
        imagen.setImageResource(listaObjetos.get(i).getImagen());
        descripcion.setText(listaObjetos.get(i).getDescripcion());
        precio.setText((int) listaObjetos.get(i).getPrecio());


        return vista;
    }
}
