package com.lambdaschool.bookstore.models;

import javax.persistence.*;

@Entity
@Table(name="authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorid;

    private String firstname;
    private String lastname;

    //TODO create a Many-to-Many relationship with book

    //TODO getters and setters


    public Author() {
    }
}
