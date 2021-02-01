package Lesson1.Model;

public class Cat {

    protected String name;
    protected int jumpLimit;
    protected int runLimit;

    public Cat(String name, int jumpLimit, int runLimit){
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public void run(){
        System.out.println("Кот пробежал");
    }
    public void jump(){
        System.out.println("Кот перепрыгнул");
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", jumpLimit=" + jumpLimit +
                ", runLimit=" + runLimit +
                '}';
    }
}