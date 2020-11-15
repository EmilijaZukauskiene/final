package com.emilija.final_project.services;

import com.emilija.final_project.exeption.BookNotFoundException;
import com.emilija.final_project.model.Book;
import com.emilija.final_project.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    public void updateBook(Book bookToUpdate) {

        bookRepository.save(bookToUpdate);
    }

    public void deleteBookById(Long book_id) throws BookNotFoundException {
        Book book = bookRepository.findById(book_id)
                .orElseThrow(() -> new BookNotFoundException(book_id));

        bookRepository.delete(book);
    }

    public void deleteBook(Book bookToDelete) {
        bookRepository.delete(bookToDelete);
    }
}
