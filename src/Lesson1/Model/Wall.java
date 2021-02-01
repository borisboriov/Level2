package Lesson1.Model;

import java.util.Random;

public class Wall {

    Random random = new Random();

    protected int high;

    public Wall(){
        this.high = random.nextInt(3);
    }

    public int getHigh() {
        return high;
    }
}