package lesson2;

import java.util.HashSet;
import java.util.Set;

public class Taskset {
    public static void main(String[] args) {

        Set<String> colors = new HashSet<>();

        colors.add("Qirmizi");
        colors.add("Mavi");
        colors.add("Yasil");
        colors.add("Qara");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
