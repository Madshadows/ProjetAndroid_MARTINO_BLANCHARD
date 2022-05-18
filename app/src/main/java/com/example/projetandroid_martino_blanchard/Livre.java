package com.example.projetandroid_martino_blanchard;

public class Livre {
    private  String titre;

    public Livre(String titre) {
        this.titre = titre;

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString(){
        return "Livre{" +
                "titre='" + titre +
                '}';
    }
}
