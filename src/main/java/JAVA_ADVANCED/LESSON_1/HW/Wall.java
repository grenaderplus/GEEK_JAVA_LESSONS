package JAVA_ADVANCED.LESSON_1.HW;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void obstaclePass(Action a) {
        a.jump(height);
    }
}
