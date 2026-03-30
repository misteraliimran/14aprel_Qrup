package az.developia.StudentManagementSystem.repository;

import entity.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRepository {

    public void addBook(Book book) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/schooldb?useSSL=false",
                    "root",
                    "1234aliimran"
            );

            String sql = "INSERT INTO books (id, title, author, publication_year, register_date) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, book.getId());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.setInt(4, book.getPublicationYear());
            ps.setObject(5, book.getRegisterDate());

            ps.executeUpdate();

            System.out.println("Book əlavə olundu");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}