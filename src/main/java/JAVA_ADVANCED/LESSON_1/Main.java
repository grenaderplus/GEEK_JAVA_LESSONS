package JAVA_ADVANCED.LESSON_1;

public class Main {
    public static void main(String[] args) {
//        JumpAble[] jumpAbles = {
//                new Cat(),
//                new Kangoo(),
//                new Cat()
//        };
//
//        for (JumpAble j : jumpAbles) {
//            j.jump();
//        }
        testJump(new Cat());
        System.out.println("JAVA");
    }



    static void testJump(JumpAble j) {
        j.jump();
    }
}
