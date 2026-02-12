package lesson2;

import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Aslan");
        students.add("Aygun mellime");
        students.add("Yusif");
        students.add("Sema");
        students.add("Rehman");
        students.add("Omer");
        students.add("Mustafa");
        students.add("Sexavet");
        students.add("Vuqar");
        students.add("Aliimran");
        
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(85);
        grades.add(90);
        grades.add(78);
        grades.add(88);
        grades.add(92);
        grades.add(81);
        grades.add(81);
        grades.add(95);
        grades.add(83);
        grades.add(90);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " - Grade: " + grades.get(i));
        }
    }
}
