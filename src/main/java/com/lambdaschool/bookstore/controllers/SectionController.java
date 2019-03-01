package com.lambdaschool.bookstore.controllers;

import com.lambdaschool.bookstore.models.Section;
import com.lambdaschool.bookstore.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path={"/sections"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class SectionController {
    @Autowired
    SectionRepository sectionRepo;

    @GetMapping("")
    public List<Section> getAllSections() {
        return sectionRepo.findAll();
    }
}
