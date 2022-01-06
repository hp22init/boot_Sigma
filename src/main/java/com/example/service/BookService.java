package com.example.service;

import com.example.dto.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BookService {

    Book create(Book book);

    List<Book> read();

    Book update(Book book);

    Map<String, String> delete(String id);

}
