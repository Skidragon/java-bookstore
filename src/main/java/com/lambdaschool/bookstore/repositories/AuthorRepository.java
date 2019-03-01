package com.lambdaschool.bookstore.repositories;

import com.lambdaschool.bookstore.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
