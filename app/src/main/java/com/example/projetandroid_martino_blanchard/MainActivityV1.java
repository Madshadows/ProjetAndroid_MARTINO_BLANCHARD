package com.example.projetandroid_martino_blanchard;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainActivityV1 extends AppCompatActivity {
    private List<Livre> lesLivres;
    private TextView leTextView ;
    private TextInputEditText entrerLivre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v1);
        leTextView=findViewById(R.id.bibliotheque);
        entrerLivre = findViewById(R.id.EntrerText);
        initListLivre();

        LivreAdapter monLivreAdapter = new LivreAdapter(lesLivres);

        RecyclerView monRecyclerView
                =findViewById(R.id.listeLivre);
        monRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @SuppressLint("NewApi")
    private void initListLivre() {

            lesLivres= IntStream.range(1,100)
                    .mapToObj(
                            i -> {return  new Livre("l_"+i);}
                    ).collect(Collectors.toList());

    }

    public void onClickBtnValider(View view){
    lesLivres.add(new Livre(entrerLivre.getText().toString()));


        Toast.makeText(this, "ça marche", Toast.LENGTH_LONG).show();
    }
}
