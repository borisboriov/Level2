package Lesson1.Model;

import java.util.Random;

public class Treadmill {

    Random random = new Random();

    protected int length;

    public Treadmill(){
        this.length = random.nextInt(400);
    }

    public int getLength() {
        return length;
    }
}