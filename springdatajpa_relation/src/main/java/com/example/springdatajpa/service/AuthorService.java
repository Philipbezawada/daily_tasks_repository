package com.example.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.entity.Author;
import com.example.springdatajpa.repository.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
