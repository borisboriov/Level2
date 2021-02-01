package Lesson1;

import Lesson1.Model.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Object[] participants = generateParticipants();
        Object[] obstacles = generateObstacles();
        action(participants, obstacles);




    }

    public static void action(Object[] participants, Object[] obstacles) {

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (participants[i] instanceof Human){
                    Human human  = (Human)participants[i];
                    if (obstacles[j] instanceof Wall){
                        Wall wall = new Wall();
                        if ((human.getJumpLimit()) > wall.getHigh()){
                            human.jump();
                        } else {
                            System.out.println( human.getName() + " out");
                            break;
                        }
                    }else if (obstacles[j] instanceof Treadmill){
                        Treadmill treadmill = new Treadmill();
                        if (human.getRunLimit() > treadmill.getLength()){
                            human.run();
                        } else {
                            System.out.println(human.getName() + " out");
                            break;
                        }
                    }
                }else if (participants[i] instanceof Cat){
                    Cat cat = (Cat)participants[i];
                    if (obstacles[j] instanceof Wall){
                        Wall wall = new Wall();
                        if (cat.getJumpLimit() > wall.getHigh()){
                            cat.jump();
                        } else {
                            System.out.println(cat.getName() + " out");
                            break;
                        }
                    } else if (obstacles[j] instanceof Treadmill){
                        Treadmill treadmill = new Treadmill();
                        if (cat.getRunLimit() > treadmill.getLength()){
                            cat.jump();
                        } else {
                            System.out.println(cat.getName() + " out");
                            break;
                        }
                    }

                } else if (participants[i] instanceof Robot){
                    Robot robot = (Robot)participants[i];
                    if (obstacles[j] instanceof Wall){
                        Wall wall = new Wall();
                        if (robot.getJumpLimit() > wall.getHigh()){
                            robot.jump();
                        } else {
                            System.out.println(robot.getName() + " out");
                            break;
                        }
                    } else if (obstacles[j] instanceof Treadmill){
                        Treadmill treadmill = new Treadmill();
                        if (robot.getRunLimit() > treadmill.getLength()){
                            robot.jump();
                        } else {
                            System.out.println(robot.getName() + " out");
                        }
                    }
                }
            }
        }

    }


    private static Object[] generateParticipants() {
        Random random = new Random();

        Object[] ps = new Object[9];
        for (int i = 0; i < ps.length; i+=3) {
            ps[i] = new Cat("Кот № " + i, random.nextInt(3), random.nextInt(600));
        }
        for (int i = 1; i < ps.length; i+=3) {
            ps[i] = new Human("Чел № " + i, random.nextInt(2), random.nextInt(400));
        }
        for (int i = 2; i < ps.length; i+=3) {
            ps[i] = new Robot("Робот №" + i, random.nextInt(1), random.nextInt(500));
        }
        return ps;
    }

    private static Object[] generateObstacles() {
        Object[] os = new Object[6];
        for (int i = 0; i < os.length; i+=2) {
            os[i] = new Treadmill();
        }
        for (int i = 3; i < os.length; i+=2) {
            os[i] = new Wall();
        }
        return os;
    }


}