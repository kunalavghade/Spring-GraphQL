package com.graphql.graphql.controller;

import com.graphql.graphql.entity.Book;
import com.graphql.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book) {
        return  bookService.create(book);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{bookId}")
    public Book get(@PathVariable int bookId) {
        return bookService.get(bookId );
    }
}
