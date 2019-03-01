package com.lambdaschool.bookstore.repositories;

import com.lambdaschool.bookstore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
