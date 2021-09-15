package com.bluesoft.spring5webappexample.controllers;

import com.bluesoft.spring5webappexample.domain.Author;
import com.bluesoft.spring5webappexample.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(final AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public String getAuthors(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "authors/list";
    }

}
