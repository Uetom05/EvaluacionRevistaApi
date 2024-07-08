package com.example.evrevistaapi.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.evrevistaapi.Models.Articulo;
import com.example.evrevistaapi.R;

import java.util.List;

public class AdapterArticulos extends RecyclerView.Adapter<AdapterArticulos.ArticuloViewHolder> {
    private Context context;
    private List<Articulo> lstArticulos;
    public AdapterArticulos(Context mCtx, List<Articulo> articulos) {
        this.lstArticulos = articulos;
        context = (Context) mCtx;
    }
    public ArticuloViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.ly__itemarticulo, null);
        return new ArticuloViewHolder(view);
    }

    public void onBindViewHolder(ArticuloViewHolder holder, int position) {
        Articulo articulo = lstArticulos.get(position);

        holder.textViewTituloArticulo.setText(articulo.getTituloArticulo());
        holder.textViewAAutores.setText(articulo.getAutorArticulo());

    }

    public int getItemCount() {return lstArticulos.size();}

    class ArticuloViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTituloArticulo, textViewAAutores;
        public ArticuloViewHolder(View itemView) {
            super(itemView);
            textViewTituloArticulo = itemView.findViewById(R.id.txtTituloArticulo);
            textViewAAutores = itemView.findViewById(R.id.txtAutoresArticulo);

        }
    }
}
