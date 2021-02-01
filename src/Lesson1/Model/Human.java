package Lesson1.Model;

public class Human {

    protected String name;
    protected int jumpLimit;
    protected int runLimit;

    public Human(String name, int jumpLimit, int runLimit){
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public String getName() {
        return name;
    }

    public void run(){
        System.out.println("Человек пробежал");
    }
    public void jump(){
        System.out.println("Человек перепрыгнул");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", jumpLimit=" + jumpLimit +
                ", runLimit=" + runLimit +
                '}';
    }
}