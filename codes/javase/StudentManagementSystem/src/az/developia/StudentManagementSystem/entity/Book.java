package az.developia.StudentManagementSystem.entity;

import java.time.LocalDateTime;

public class Book {

    private Integer id;
    private String title;
    private String author;
    private Integer publicationYear;
    private LocalDateTime registerDate;

    public Book(Integer id, String title, String author, Integer publicationYear, LocalDateTime registerDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.registerDate = registerDate;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }
}