package com.bookstore.jpa.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bookstore.jpa.dto.BookRecordDTO;
import com.bookstore.jpa.models.BookModel;
import com.bookstore.jpa.models.ReviewModel;
import com.bookstore.jpa.repositories.AuthorRepository;
import com.bookstore.jpa.repositories.BookRepository;
import com.bookstore.jpa.repositories.PublisherRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {
    
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository){
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    public  BookModel saveBook(BookRecordDTO bookRecordDTO){
        BookModel book = new BookModel();
        book.setTitle(bookRecordDTO.title());
        book.setPublisher(publisherRepository.findById(bookRecordDTO.publisherId()).get());
        book.setAuthors(authorRepository.findAllById(bookRecordDTO.authorsIds()).stream().collect(Collectors.toSet()));

        ReviewModel reviewModel = new ReviewModel();
        reviewModel.setComment(bookRecordDTO.reviewComment());
        reviewModel.setBook(book);
        book.setReview(reviewModel);    

        return bookRepository.save(book);
    }

    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<BookModel> deleteBook(UUID id)
    {
        bookRepository.deleteById(id);
        return getAllBooks();
    }


    
}

