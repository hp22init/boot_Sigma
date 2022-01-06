package com.example.controller;

import com.example.dto.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired
    private BookService bookService;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book saveSchool(@RequestBody Book book) {

        return bookService.create(book);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllSchools() {

        return bookService.read();
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book updateSchool(@RequestBody Book book) {

        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteSchool(@PathVariable String id) {

        return bookService.delete(id);
    }

}
