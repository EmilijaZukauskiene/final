package com.emilija.final_project.repositories;

import com.emilija.final_project.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
public Book findAllById_book(int Id);

public Book findAllByTitle(String title);
}
