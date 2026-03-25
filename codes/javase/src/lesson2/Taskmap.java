package lesson2;

import java.util.*;

public class Taskmap {
    public static void main(String[] args) 
    
        Map<String, Integer> students = new HashMap<>();

        students.put("Aslan", 11);
        students.put("Sema", 14);
        students.put("Yusif", 12);
        students.put("Mustafa", 13);
        students.put("Sexavet", 10);
        students.put("Omer", 15);
        students.put("Vuqar", 12);
        students.put("Turqay", 13);
        
        System.out.println("Bütün uşaqlar:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nYaşı 12-dən böyük olanlar:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 12) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
