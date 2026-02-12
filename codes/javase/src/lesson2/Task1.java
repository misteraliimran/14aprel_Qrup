package lesson2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        int sum = 0;

        for (int num : set) {
            sum += num;
        }

        System.out.println("Təkrarsız ədədlər: " + set);
        System.out.println("Cəm: " + sum);
    }
}
