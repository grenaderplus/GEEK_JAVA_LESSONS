package JAVA_ADVANCED.LESSON_1.Enums;

public class Main {
    public static void main(String[] args) {
        Planets planet = Planets.Earth;
        System.out.println(planet.compareTo(Planets.Jupiter));
        for (Planets p: Planets.values()) {
            System.out.println(p);
            System.out.println(p.ordinal());
        }
    }
}
