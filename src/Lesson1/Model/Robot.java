package Lesson1.Model;

public class Robot {

    protected String name;
    protected int jumpLimit;
    protected int runLimit;

    public Robot(String name, int jumpLimit, int runLimit){
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public void run(){
        System.out.println("Робот пробежал");
    }
    public void jump(){
        System.out.println("Робот перепрыгнул");
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

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", jumpLimit=" + jumpLimit +
                ", runLimit=" + runLimit +
                '}';
    }
}