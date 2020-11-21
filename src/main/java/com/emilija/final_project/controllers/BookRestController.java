package com.emilija.final_project.controllers;

import com.emilija.final_project.exeption.BookNotFoundException;
import com.emilija.final_project.model.Book;
import com.emilija.final_project.services.BookService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")//localhost:8080
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    public void createBook(@Valid @RequestBody Book book) {
        bookService.createBook(book);
    }

    @GetMapping("books/{id}")
    public Book getBookById(@PathVariable(value = "id") Long book_Id) {
       return bookService.findBookById(book_Id);
    }

    @PostMapping("/update")
    public void updateBook(@RequestBody Book bookToUpdate)  {
      bookService.updateBook(bookToUpdate);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookById(@PathVariable(value="id")Long book_id) throws BookNotFoundException {
        bookService.deleteBookById(book_id);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@Valid @RequestBody Book bookToDelete){
        bookService.deleteBook(bookToDelete);
    }
}
