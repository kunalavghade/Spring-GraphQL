package com.graphql.graphql.repositories;

import com.graphql.graphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {


}
