package com.lambdaschool.bookstore.repositories;

import com.lambdaschool.bookstore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO wrote (bookid, authorid) VALUES (:bookid, :authorid)", nativeQuery = true)
    void insertWrote(long bookid, long authorid);
}
