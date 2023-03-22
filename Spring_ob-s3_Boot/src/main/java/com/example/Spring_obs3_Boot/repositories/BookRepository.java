package com.example.Spring_obs3_Boot.repositories;

import com.example.Spring_obs3_Boot.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
