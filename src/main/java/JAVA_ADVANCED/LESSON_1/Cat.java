package JAVA_ADVANCED.LESSON_1;

public class Cat implements SuperJumpAble {

    @Override
    public void jump() {
        System.out.println("Cat jump!");
    }

//    @Override
//    public void run() {
//        System.out.println("Cat run!");
//    }

    @Override
    public void run(int n) {
        System.out.println("Cat run" + n);
    }

    @Override
    public void superJump(int d, int h) {
        System.out.println("Cat run " + d + " meter and jump " + h + " meter");
    }
}
