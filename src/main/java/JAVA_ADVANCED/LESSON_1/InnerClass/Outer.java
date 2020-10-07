package JAVA_ADVANCED.LESSON_1.InnerClass;

public class Outer {

    private int x;

    public Outer(int x) {
        this.x = x;
    }

    class Inner {
        int y;

        public Inner(int y) {
            this.y = y;
        }

        public void printOutValue(){
            System.out.println(x);
        }
    }

    static class InnerStaticClass{
        public void print(){
            System.out.println("JAVA");
        }
    }
}
