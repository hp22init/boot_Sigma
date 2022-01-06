package com.example.service;

import com.example.dto.Book;
import com.example.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book create(Book book) {
        return bookRepository.insert(book);
    }

    @Override
    public List<Book> read() {
        return bookRepository.findAll();
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Map<String, String> delete(String id) {
        // Total count of data before delete
        long beforeDelete = bookRepository.count();

        bookRepository.deleteById(id);

        // Total count of data after delete
        long afterDelete = bookRepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }
}
