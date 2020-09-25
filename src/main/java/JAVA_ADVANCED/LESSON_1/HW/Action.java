package JAVA_ADVANCED.LESSON_1.HW;

public interface Action {
    public void run(int distance);
    public void jump(int height);
    boolean actionCheck();
    void info();
}
