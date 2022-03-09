package Fourmis;

import static fr.Fourmis.Randomnumb.randomNumber;

public class Nourice extends Fourmis {

    private static final int id = 0;

    public Nourice(int age, int strength) {
        super(age,strength);
    }

    @Override
    public float Deplacement (Environnement environnement) {
        if (environnement == Environnement.HERBE){
            return 0.5F;
        } else {
            return 1.0F;
        }
    }

    @Override
    public String toString() {
        return "Nourice" + super.toString();
    }

    public void Nurse (Fourmiliere fourmiliere){
        if (fourmiliere.getOeufs() >= 1){
            fourmiliere.setOeufs(fourmiliere.getOeufs()-1);
            int type = randomNumber(1,3);
            if (type == 1){
                Fourmis fourmi = new Chasseresse(0,0);
            } else if (type == 2){
                Fourmis fourmi = new Nourice(0,0);
            } else {
                Fourmis fourmi = new Ouvriere(0,0);
            }
        }
    }
}