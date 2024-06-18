package com.example.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
