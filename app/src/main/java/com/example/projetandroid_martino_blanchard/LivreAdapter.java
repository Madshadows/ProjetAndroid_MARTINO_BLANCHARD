package com.example.projetandroid_martino_blanchard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class LivreAdapter extends RecyclerView.Adapter<LivreViewHolder> {

    private List<Livre> lesLivres;

    public LivreAdapter(List<Livre> lesLivres) {
        this.lesLivres = lesLivres;
    }

    @NonNull
    @Override
    public LivreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater monLayoutInflater
                =LayoutInflater.from(parent.getContext());

        View monViewObject
                = monLayoutInflater.inflate(R.layout.layout_affiche_livre, parent, false);

        return new LivreViewHolder(monViewObject);
    }

    @Override
    public void onBindViewHolder(@NonNull LivreViewHolder holder, int position) {

        holder.mettreAJourLigne(lesLivres.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
