package com.graphql.graphql;

import com.graphql.graphql.entity.Book;
import com.graphql.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Cpp for beginner");
		b1.setAuthor("James cord");
		b1.setDesc("Basic cpp programming");
		b1.setPages(278);
		b1.setPrice(51.27);

		Book b2 = new Book();
		b2.setTitle("java for beginner");
		b2.setAuthor("Michel brook");
		b2.setDesc("Basic Java programming");
		b2.setPages(350);
		b2.setPrice(310.12);

		Book b3 = new Book();
		b3.setTitle("Python for beginner");
		b3.setAuthor("Larry Hemlock");
		b3.setDesc("Basic python programming");
		b3.setPages(180);
		b3.setPrice(40.67);

		bookService.create(b1);
		bookService.create(b2);
		bookService.create(b3);
	}
}
