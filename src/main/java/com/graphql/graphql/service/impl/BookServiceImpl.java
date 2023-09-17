package com.graphql.graphql.service.impl;

import com.graphql.graphql.entity.Book;
import com.graphql.graphql.repositories.BookRepo;
import com.graphql.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Override
    public Book create(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book get(int id) {
        return bookRepo.findById(id).orElseThrow(()-> new RuntimeException("Book you are looking for not available on server"));
    }
}
