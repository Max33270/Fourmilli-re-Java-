package Fourmis;

public class Chasseresse extends Fourmis {
    public static int ID = 1;
    private int id;
    Chasseresse(int age, int strength) {
        super(age,strength);
        id = ID++;
    }

    @Override
    public float Deplacement(Environnement environnement) {
        return getStrength();
    }

    public void Chasser (Fourmiliere fourmiliere){
        int foodRations = fourmiliere.getStockNourriture();
        fourmiliere.setStockNourriture(foodRations + getStrength());
        try {
            if (fourmiliere.getStockNourriture() > 10* fourmiliere.getNombreSalles()){
                throw new ExceptionNourriture("La chasseresse " + id + " a travaillé pour rien!");
            }
        } catch (ExceptionNourriture err) {
            err.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Chasseresse " +
                id + " " +
                age + " " +
                strength + "\n";
    }

}

