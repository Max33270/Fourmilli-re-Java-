package Fourmis;

import static fr.Fourmis.Randomnumb.randomNumber;

public class Ouvriere extends Fourmis {

    public Ouvriere(int age,int strength) {
        super(age,strength);
    }

    @Override
    public float Deplacement(Environnement environnement) {
        if (environnement == Environnement.SABLE){
            return 2.0F;
        } else {
            return 1.0F;
        }
    }

    public String toString(){
        return "Ouvriere" + super.toString();
    }

    public void Aggrandissement(Fourmiliere fourmiliere){
        int random = randomNumber(0,100);
        int chances = (int) (0.1/age*100);
        if (chances <= random) {
            fourmiliere.setNombreSalles(fourmiliere.getNombreSalles()+1);
        }
    }


}
