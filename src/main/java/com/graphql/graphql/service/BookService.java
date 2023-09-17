package com.graphql.graphql.service;

import com.graphql.graphql.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Book create(Book book);

    List<Book> getAll();

    Book get(int id) ;
}
