package lesson2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("JavaScript");

        System.out.println("Original list: " + words);

        Collections.reverse(words);

        System.out.println("Reversed list: " + words);
    }
}
