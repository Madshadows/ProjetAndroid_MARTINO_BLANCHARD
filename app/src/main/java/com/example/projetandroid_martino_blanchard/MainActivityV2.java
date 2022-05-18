package com.example.projetandroid_martino_blanchard;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainActivityV2 extends AppCompatActivity{
    private TextView leTextView;
    private TextInputEditText entrerLivre;
    private Button leBoutonValider;
    private Button leBoutonAfficher;
    private RecyclerView leRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_v2);
        leTextView=findViewById(R.id.bibliotheque);
        entrerLivre = findViewById(R.id.EntrerText);
        leBoutonValider=findViewById(R.id.btnValider);
        leBoutonAfficher=findViewById(R.id.btnAffichage);
        RecyclerView monRecyclerView
                =findViewById(R.id.rvAffichage);
        monRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void onClickBtnAffichage(View view){

    }
}
