package JAVA_BASE.LESSON_7;

public class Cat {
    private String name;
    private Boolean starvingStatus;
    private int eatRate;

    public Cat(String name, int eatRate) {
        this.name = name;
        this.starvingStatus = true;
        this.eatRate = eatRate;
    }

    public void eat(Plate plate) {
        if (starvingStatus == true) {
            if (plate.getFood() < eatRate || plate.getFood() < 0) {
                System.out.println("Cat " + name + " is eating...");
                System.out.println("Недостаточно еды в миске");
                return;
            } else {
                System.out.println("Cat " + name + " is eating...");
                plate.decreaseFood(eatRate);
                starvingStatus = false;
            }
        } else {
            System.out.println("Cat " + name + " is allready fine, no need to eat more");
        }
    }

        public void printStarvingStatus(){
            if (starvingStatus == true) {
                System.out.println("Cat " + name + " is hungry");
            } else {
                System.out.println("Cat " + name + " is fine");
            }
        }

        public void info () {
            System.out.printf("Cat %s голоден - %b\n", name, starvingStatus);
        }

        public String getName () {
            return name;
        }

        public int getEatRate () {
            return eatRate;
        }

    public Boolean getStarvingStatus() {
        return starvingStatus;
    }
}


    //    public void fear(Dog dog) {
//        System.out.println("Cat " + name + " afraid of " + dog.getName());
//    }

