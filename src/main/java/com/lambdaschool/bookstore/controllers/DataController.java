package com.lambdaschool.bookstore.controllers;

import com.lambdaschool.bookstore.models.Author;
import com.lambdaschool.bookstore.models.Book;
import com.lambdaschool.bookstore.repositories.AuthorRepository;
import com.lambdaschool.bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path={"/data"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class DataController {

    @Autowired
    BookRepository bookRepo;

    @Autowired
    AuthorRepository authorRepo;

    @PutMapping("/books/{id}")
    public Book updateBookById(@RequestBody Book newBook, @PathVariable long id) {
        Optional<Book> foundBook = bookRepo.findById(id);
        if(foundBook.isPresent()) {
            newBook.setBookid(id);
            return foundBook.get();
        }
        return null;
    }
    @PostMapping("/books/{bookid}/authors/{authorid}")
    public String updateBookToAuthor(@PathVariable long bookid, @PathVariable long authorid) {
        Optional<Book> foundBook = bookRepo.findById(bookid);
        if(foundBook.isPresent()) {
            Optional<Author> author = authorRepo.findById(authorid);
            if(author.isPresent()) {
                authorRepo.updateBookToAuthor(authorid, bookid);
                return "Author with id: " + authorid + " and Book with id: " + bookid + " are connected";
            }
            else {
                return "author with that id does not exist";
            }
        }
        else {
            return "book with that id does not exist";
        }
    }

    @DeleteMapping("/books/{id}")
    public Book deleteBookById(@PathVariable long id) {
        Optional<Book> foundBook = bookRepo.findById(id);

        if(foundBook.isPresent()) {
            bookRepo.deleteById(id);

            return foundBook.get();
        }
        return null;
    }


}
