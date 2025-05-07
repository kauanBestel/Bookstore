package com.bookstore.jpa.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bookstore.jpa.models.BookModel;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
    
    BookModel findByTitle(String title);
}
