package JAVA_ADVANCED.LESSON_1;

import java.io.Serializable;

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

//        testJump(new Cat());
//        Cat cat = new Cat();
//        cat.run(6);

//        JumpAble catj = new Cat();
//        catj.jump();
//        ((Cat) catj).run();

     Cat cat = new Cat();
//     cat.run(5);
//
//     System.out.println(cat instanceof JumpAble);
//
//     testJump(()->{
//         System.out.println("somebody jump...");
//    });
//
//     testRun((n)->{
//         System.out.println("run "+n+" meter");
//     });

//    testRun(cat);

    cat.superJump(3,5);

    }



    static void testJump(JumpAble j) {
        j.jump();
    }

    static void testRun(RunAble r) {
        r.run();
        r.run(5);
    }
}
