package TP3.ex1;

import java.awt.Color;

public class TestVoiture {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Voiture uneVoiture = new Voiture(123, "55AZ3344", "Renault",
                Color.BLUE, 2017);
        System.out.println("La voiture sort de l'usine, elle a les attibuts suivants :"+uneVoiture);
        Individu am = new Individu("Aurélien","Martineau");

        uneVoiture.setProprietaire(am);

        System.out.println("La voiture a été achetée par un propriétaire, elle a maintenant les attibuts suivants : "+uneVoiture);
    }
}