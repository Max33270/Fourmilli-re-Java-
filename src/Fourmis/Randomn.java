package Fourmis;

import java.util.Random;

class Randomnumb {

    public static int randomNumber(int low, int high){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }
}

