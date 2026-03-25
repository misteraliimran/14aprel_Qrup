package az.developia.CourseManagegementSystem;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Ali");
        
        
        
        student.setSurname("Aliyev");
        student.setAge(20);

        StudentRepository repository = new StudentRepository();
        repository.addStudent(student);
    }
}