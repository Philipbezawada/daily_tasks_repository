package com.example.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
