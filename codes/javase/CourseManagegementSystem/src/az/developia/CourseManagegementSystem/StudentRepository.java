package az.developia.CourseManagegementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {
     
	
    public void addStudent(Student student) {

        try {

            String url = "jdbc:mysql://localhost:3306/schooldb?useSSL=false";
            String username = "root";
            String password = "1234aliimran";

            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO students(name, surname, age) VALUES"
            		+ "('"+student.getName()
            		+"', '"+student.getSurname()
            		+"', '"+student.getAge()+"')";

            Statement statement = connection.createStatement();


            statement.executeUpdate(sql);

            System.out.println("Student əlavə edildi");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}