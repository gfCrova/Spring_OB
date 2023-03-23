package com.example.Spring_obs3_Boot;

import com.example.Spring_obs3_Boot.entities.Book;
import com.example.Spring_obs3_Boot.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringObS3BootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringObS3BootApplication.class, args);

		BookRepository bookRepository = context.getBean(BookRepository.class);

		Book book1 = new Book(null, "Don Quijote de la Mancha", "Miguel de Cervantes", 1345, LocalDate.of(1605, 1, 1), true);
		Book book2 = new Book(null, "Cien años de soledad", "Gabriel García Márquez", 471, LocalDate.of(1967, 3, 5), true);

		bookRepository.save(book1);
		bookRepository.save(book2);

		System.out.println(bookRepository.findAll());

	}

}
