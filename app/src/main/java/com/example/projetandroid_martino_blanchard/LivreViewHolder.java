package com.example.projetandroid_martino_blanchard;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LivreViewHolder extends RecyclerView.ViewHolder {
    private TextView titreTextView;

    public LivreViewHolder(@NonNull View itemView) {
        super(itemView);
        this.titreTextView = itemView.findViewById(R.id.EntrerText);
    }
}
