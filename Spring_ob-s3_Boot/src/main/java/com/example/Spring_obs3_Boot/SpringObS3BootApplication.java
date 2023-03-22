package com.example.Spring_obs3_Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringObS3BootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringObS3BootApplication.class, args);

		BookRepository bookRepository = (BookRepository) context.getBean(BookRepository.class);

		Book book1 = new Book(null, "Libro1", "John", 120, LocalDate.of(2022, 11, 25), true);
		Book book2 = new Book(null, "Libro2", "Diego", 120, LocalDate.of(2022, 11, 25), true);

		bookRepository.save(book1);
		bookRepository.save(book2);

		System.out.println(bookRepository.findAll());

		bookRepository.delete(book1);

		System.out.println(bookRepository.findAll());
	}

}
