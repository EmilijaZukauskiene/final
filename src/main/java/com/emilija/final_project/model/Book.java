package com.emilija.final_project.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column
    @NotBlank
    private String author;

    @Column
    @NotBlank
    private String title;

    @Column
    private String price;

    @Column
    private String isbn;

    @Column
    private String description;

    public Book(){
        super();
    }

    public Book(Long book_id, String author, String title, String price, String ISBN, String description) {
        this.book_id = book_id;
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = ISBN;
        this.description = description;
    }

    public Long getBook_id() {
        return book_id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setIsbn(String ISBN) {
        this.isbn = ISBN;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
