package com.lambdaschool.bookstore.controllers;

import com.lambdaschool.bookstore.models.Author;
import com.lambdaschool.bookstore.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path={"/authors"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {
    @Autowired
    AuthorRepository authorRepo;

    @GetMapping("")
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }
}
