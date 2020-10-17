package com.emilija.final_project.controllers;

import com.emilija.final_project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books") //localhost:8080/books/bookList
public class BookController {

//    @Autowired
//    private BookService bookService;
////
//    @GetMapping("/")
//    public String book(Model model){}
}
