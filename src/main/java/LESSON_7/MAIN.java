package LESSON_7;

public class MAIN {
    public static void main(String[] args) {
//        Box box1 = new Box("red", 5);
//        Box box2 = new Box("red", 5);
//
//        if(box1.equals(box2)){
//            System.out.println("Равны");
//        } else {
//            System.out.println("Не равны");
//        }
//
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//        int x = 6;
//        Integer y = 120; // Integer - присвоение примитиву свойств объекта (обертка)
//        Integer z = new Integer(120);
//        testMethod1(z);
//        testMethod2(x);

          // обертки для типов данных
//        Byte
//        Short
//        Long
//        Boolean
//        Character



//        for (Integer i = 0; i < 1000000; i++) { // объект типа Integer неизменяем - т.е. каждый раз будет создаваться новый объект в пределах цикла
//
//        }

//        if (y.equals(z)) {
//            System.out.println("Равны");
//        } else {
//            System.out.println("Не равны");
//        }

//        String s1 = "Java";
//        String s2 = "Java";
//        String s3 = new String("Java");
//        s1 = s1+" "; // String - неизменяемый объект, соответвенно создается новый объект
//
//        System.out.println(s1 == s2); // объекты созданные конструктором по умолчанию ссылаются на string pool, т.е. это ссылки на 1 объект
//        System.out.println(s1 == s3); // объекты созданные принудительным конструктором не попадают в string pool
//
//        StringBuilder sb = new StringBuilder("abc"); // используется для изменения строки
//
//        for(int i = 0; i < 1000000; i++) {
//            sb.append("1");
//        }

//        sb.append(111).append('q').append("enter"); // добавление символов,строк, чисел в строку
//        System.out.println(sb);
//
//        sb.insert(3,'f'); // добавление символа
//        System.out.println(sb);
//
//        sb.replace(2,6,"*"); // замена символов
//        System.out.println(sb);
//
//        sb.setLength(sb.length() - 3); // изменение длины строки
//        System.out.println(sb);
//
//        sb.delete(6,9); // удаление символов из строки
//        System.out.println(sb);
//
//        sb.reverse();
//        System.out.println(sb);

        Cat cat = new Cat("Barsik");
        Plate plate = new Plate(100);

        cat.eat(plate);

        System.out.println(plate);

        Dog dog = new Dog("Tuzik");
        dog.scare(cat);

    }

    static void testMethod1(int a) {
        System.out.println(a);
    }

    static void testMethod2(Integer a) {
        System.out.println(a);
    }
}
