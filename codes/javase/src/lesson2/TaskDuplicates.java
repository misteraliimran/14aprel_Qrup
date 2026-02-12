package lesson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        Set<Integer> unique = new HashSet<>();      
        Set<Integer> duplicates = new HashSet<>(); 

        for (Integer num : numbers) {
            if (!unique.add(num)) {  
                duplicates.add(num);
            }
        }
        
        System.out.println("Tekrarlanan elementler: " + duplicates);
    }
}
