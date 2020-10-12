package JAVA_ADVANCED.LESSON_3.HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneList {

    private HashMap<String, Set<String>> phonelist = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> number = phonelist.getOrDefault(name, new HashSet<>());
        number.add(phone);
        phonelist.put(name, number);
    }

    public Set<String> get(String name) {
        return phonelist.get(name);
    }
}
