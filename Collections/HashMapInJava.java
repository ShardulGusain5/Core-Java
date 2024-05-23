package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Shardul", 10);
        students.put("shubham",100);
        System.out.println(students);
        System.out.println(students.get("Shardul"));

        for(String name:students.keySet())
        {
            System.out.println(name);
        }
    }
}
