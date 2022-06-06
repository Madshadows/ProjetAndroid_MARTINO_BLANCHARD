package com.example.projetandroid_martino_blanchard;

import android.os.Build;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

public class LivreViewHolder extends RecyclerView.ViewHolder {
    private TextView titreTextView;

    public LivreViewHolder(@NonNull View itemView) {
        super(itemView);
        titreTextView = itemView.findViewById(R.id.id_textview_titre);
    }
    public void mettreAJourLigne(Livre unLivre){
        if(Objects.nonNull(unLivre)){

            this.titreTextView.setText((unLivre.getTitre()));
           }
    }
}
