package lesson2;

public class School {

    class Student {
        String name;
        int grade;

        void showInfo() {
            System.out.println("Ad: " + name);
            System.out.println("Sinif: " + grade);
        }
    }

    public static void main(String[] args) {
    	
        School school = new School();
        Student student = school.new Student();

        student.name = "Ali";
        student.grade = 9;

        student.showInfo();
    }
}
