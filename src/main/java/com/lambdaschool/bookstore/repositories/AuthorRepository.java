package com.lambdaschool.bookstore.repositories;

import com.lambdaschool.bookstore.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Transactional
    @Modifying
    @Query(value ="UPDATE wrote SET authorid = :authorid, bookid = :bookid", nativeQuery = true)
    void updateBookToAuthor(@Param("authorid") long authorid, @Param("bookid") long bookid);
}
