package JAVA_BASE.LESSON_7;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override // переопределение метода equals, чтобы сравнение объектов проходило по параметрам
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!obj.getClass().equals(Box.class)) {
            return false;
        }

        Box another = (Box) obj;
        if(!color.equals(another.color)){
            return false;
        }

        return size == another.size;
    }

    // hashCode - адрес объекта в памяти; если объекты равны по equals, хэшкоды должны быть так же равны
    @Override // переопределение метода hashCode, делается вместе с переопределением метода equals
    public int hashCode() {
        return color.hashCode() + size;
    }

}
