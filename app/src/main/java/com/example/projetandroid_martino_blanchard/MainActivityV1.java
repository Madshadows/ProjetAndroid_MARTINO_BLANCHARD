package com.example.projetandroid_martino_blanchard;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainActivityV1 extends AppCompatActivity {
    private List<Livre> lesLivres;
    private TextView leTextView;
    private TextInputEditText entrerLivre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v1);
        leTextView=findViewById(R.id.bibliotheque);
        entrerLivre = findViewById(R.id.EntrerText);
        initListLivre();

        RecyclerView monRecyclerView
                =findViewById(R.id.listeLivre);
        monRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListLivre() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            lesLivres= IntStream.range(1,100)
                    .mapToObj(
                            i -> {return  new Livre("l_"+i);}
                    ).collect(Collectors.toList());
        }
    }

    public void onClickBtnValider(View view){
    lesLivres.add(new Livre(entrerLivre.getText().toString()));
    }
}
