package JAVA_ADVANCED.LESSON_1.Enums;

public enum Planets {
    Mercury(0), Venus(0), Earth(1), Mars(2), Jupiter(9), Saturn(8), Uranus(6), Neptune(2);

    private int satelliteCount;

    Planets(int satelliteCount) {
        this.satelliteCount = satelliteCount;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }
}
