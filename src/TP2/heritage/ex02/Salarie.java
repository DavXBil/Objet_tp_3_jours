package TP2.heritage.ex02;

public class Salarie extends Individu {
    private int salaire;

    public Salarie(String prenom, String nom, int salaire) {
        super(prenom, nom);
        setSalaire(salaire);
    }

    @Override
    public String toString() {
        return super.toString()+", salaire=" + getSalaire() + "€/mois";
    }

    public int getSalaire() {

        return salaire;
    }

    public void setSalaire(int salaire) {

        this.salaire = salaire;
    }
}
