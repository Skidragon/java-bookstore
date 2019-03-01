package com.lambdaschool.bookstore.models;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookid;

    private String booktitle;
    private String ISBN;

    private int copy;

    //TODO setup Many to One relationship with section
    private long sectionid;

    //TODO setup Many to Many relationship with author

    //TODO getters and setters
    public Book() {
    }
}
