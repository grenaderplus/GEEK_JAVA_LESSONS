package LESSON_7;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " is eating...");
        plate.decreaseFood(10);
    }

    public String getName() {
        return name;
    }

    public void fear(Dog dog) {
        System.out.println("Cat " + name + " afraid of " + dog.getName());
    }
}
