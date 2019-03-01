package com.lambdaschool.bookstore.models;

import javax.persistence.*;

@Entity
@Table(name="sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long section;

    private String name;

    //TODO Setup the Many-To-One relationship with Book

    //TODO getters and setters

    public Section() {
    }
}
