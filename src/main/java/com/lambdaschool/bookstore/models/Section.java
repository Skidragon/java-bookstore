package com.lambdaschool.bookstore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sectionid;

    private String name;

    @ManyToOne
    @JoinColumn(name="sections")
    @JsonIgnore
    private Book book;

    public Section() {
    }

    public long getSectionid() {
        return sectionid;
    }

    public void setSectionid(long sectionid) {
        this.sectionid = sectionid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
