package com.emilija.final_project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "books")
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_book;


    @Column
    private String title;

    @Column
    private String ISBN;

    @Column
    private String description;

    public Book(String title, String ISBN, String description) {

        this.title = title;
        this.ISBN = ISBN;
        this.description = description;
    }

    public Book(int id_book, String title, String ISBN, String description) {
        this.id_book = id_book;
        this.title = title;
        this.ISBN = ISBN;
        this.description = description;
    }
}
