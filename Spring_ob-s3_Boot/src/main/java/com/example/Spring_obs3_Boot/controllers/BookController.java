package com.example.Spring_obs3_Boot.controllers;

import com.example.Spring_obs3_Boot.entities.Book;
import com.example.Spring_obs3_Boot.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Método para Recuperar datos
    @GetMapping("/books")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
