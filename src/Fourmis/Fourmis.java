package Fourmis;

public abstract class Fourmis {
    protected int age;
    protected int strength;

    Fourmis(int age, int strength){
       this.age = age;
       this.strength = strength;
    }

    public void Communication(Fourmis smallAnt){
        System.out.println("Hey little ant, how are you" + smallAnt + "?");
    }

    public abstract float Deplacement(Environnement environnement);

    @Override
    public String toString() {
        return "age=" + age +
                "strength=" + strength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}


