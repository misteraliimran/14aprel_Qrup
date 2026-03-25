package az.developia.studentManagementSystem.exception;

public class Main {
    public static void main(String[] args) {

        StudentRepository repo = new StudentRepository();

        repo.register(new Student("aliimran", "1234aliimran"));
        repo.register(new Student("said", "5678"));

        boolean result = repo.login("adil", "1234");

        if (result) {
            System.out.println("Login uğurludur");
        } else {
            System.out.println("Login uğursuzdur");
        }
    }
}