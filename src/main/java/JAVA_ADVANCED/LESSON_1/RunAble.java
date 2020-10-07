package JAVA_ADVANCED.LESSON_1;

@FunctionalInterface
public interface RunAble {

    default void run() {
        System.out.println("run!");
    }

    void run(int n);
}
