package JAVA_ADVANCED.LESSON_1.HW;

public class Main {
    public static void main(String[] args) {
        Action[] actionTeam = {
                new Human("Boris"),
                new Human("John",3000,3,true),
                new Cat("Turbo"),
                new Cat("Tank",650,1,true),
                new Robot("R2-D2"),
                new Robot("Zombotron-5000")
        };

        Obstacle[] obstacles = {
                new Road(1000),
                new Road(2500),
                new Wall(1),
                new Wall(3)
        };

        for (Action a : actionTeam) {
            for (Obstacle o : obstacles) {
                o.obstaclePass(a);
                if(!a.actionCheck()){
                    break;
                }
            }
        }

       for (Action action : actionTeam) {
           action.info();
       }
    }
}
