package JAVA_ADVANCED.LESSON_1.HW;

public class Road implements Obstacle {
    private int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public void obstaclePass(Action a) {
        a.run(distance);
    }
}
