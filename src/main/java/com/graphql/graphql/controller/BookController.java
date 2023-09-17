package com.graphql.graphql.controller;

import com.graphql.graphql.entity.Book;
import com.graphql.graphql.graphql.BookInput;
import com.graphql.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @MutationMapping("create")
    public Book create(@Argument BookInput book) {
        Book bookObj = new Book();
        bookObj.setPrice(book.getPrice());
        bookObj.setDesc(book.getDesc());
        bookObj.setAuthor(book.getAuthor());
        bookObj.setPages(book.getPages());
        bookObj.setTitle(book.getTitle());
        return  bookService.create(bookObj);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return bookService.get(bookId );
    }
}

