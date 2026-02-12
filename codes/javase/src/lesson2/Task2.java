package lesson2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        String text = "hello world";

        Set<Character> letters = new HashSet<>();

        for (char ch : text.toCharArray()) {

            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        System.out.println("Fərqli hərflər: " + letters);
        System.out.println("Fərqli hərflərin sayı: " + letters.size());
    }
}
