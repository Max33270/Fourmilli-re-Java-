package Fourmis;

import java.util.ArrayList;
import static fr.Fourmis.Randomnumb.randomNumber;

public class Fourmiliere {
     private int oeufs;
     private int stockNourriture;
    private int nombreSalles;
    ArrayList<Fourmis> collections;

    public int getStockNourriture() {
        return stockNourriture;
    }

    public void setStockNourriture(int stockNourriture) {
        this.stockNourriture = stockNourriture;
    }

    public int getNombreSalles() {
        return nombreSalles;
    }

    public void setNombreSalles(int nombreSalles) {
        this.nombreSalles = nombreSalles;
    }

    public int getOeufs() {
        return oeufs;
    }

    public void setOeufs(int oeufs) {
        this.oeufs = oeufs;
    }

    public Fourmiliere() {
        this.oeufs = randomNumber(10,20);
        this.stockNourriture = randomNumber(15,20);
        this.nombreSalles = randomNumber(3,7);
        this.collections = new ArrayList<>();
        collections.add(new Nourice(1,2));
        collections.add(new Chasseresse(1,2));
        collections.add(new Chasseresse(3,2));
        collections.add(new Ouvriere(3,4));
    }

    @Override
    public String toString() {
        String res = "________________" +
                "\nNourriture " + stockNourriture +
                "\nOeufs " + oeufs +
                "\nSalles " + nombreSalles
                + "\n\n";
        for (Fourmis fourmis : collections){
            res += fourmis.toString();
        }
        return res;

    }

    public void action() {
        oeufs += randomNumber(0, 5);
        stockNourriture -= collections.size();
        for (Fourmis Joe : collections) {
            if (Joe.getClass() == Nourice.class) {
                ((Nourice) Joe).Nurse(this);
            } else if (Joe.getClass() == Chasseresse.class) {
                ((Chasseresse) Joe).Chasser(this);
            } else {
                ((Ouvriere) Joe).Aggrandissement(this);
            }
        }
    }
}


