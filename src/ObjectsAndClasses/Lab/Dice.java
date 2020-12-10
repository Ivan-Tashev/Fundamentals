package ObjectsAndClasses.Lab;

import java.util.Random;

public class Dice {
    private int sides; // <- field, private - only access in class Dice

    public Dice(int sides){
        this.sides = sides;
    }

    public int roll() {  // <- method
        Random rnd = new Random();
        int sides = rnd.nextInt(this.sides + 1);
        return sides;
    }
    public int getSides() {  // <- getter
        return this.sides;  // <-
    }
    public void setSides(int sides) {  // <- setter
        this.sides = sides;
    }
}
