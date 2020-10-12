package JAVA_ADVANCED.LESSON_3.HW;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String [] words = {"cow","dog","cat","dog","duck","cat","mouse","cow","elephant","crocodile","sheep","cat","pigeon","dog","sheep","mouse"};
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> hm = new HashMap<>();
        for (String x : words) {
           hm.put(x, hm.getOrDefault(x,0) + 1);
        }
        System.out.println(hm);

        PhoneList phonebook = new PhoneList();
        phonebook.add("Alex","9104310363");
        phonebook.add("Boris","9165145563");
        phonebook.add("Alexey","9245430161");
        phonebook.add("Alex","9345678494");
        phonebook.add("Boris","9179995454");
        phonebook.add("Alexey","9108763423");
        phonebook.add("Pavel","9194431013");
        phonebook.add("Roman","9654564556");

        System.out.println("Phone Number: " + phonebook.get("Roman"));
    }
}
