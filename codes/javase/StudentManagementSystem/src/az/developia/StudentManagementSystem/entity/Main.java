package az.developia.StudentManagementSystem.entity;

import entity.Book;
import repository.StudentRepository;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        StudentRepository repo = new StudentRepository();

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling",
                2020,
                LocalDateTime.now()
        );

        repo.addBook(book);
    }
}