package com.example.BookManagementApplication.service;

//package com.example.bookmanagement.service;

import com.example.BookManagementApplication.entity.Book;
import com.example.BookManagementApplication.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public Book updateBook(Long id, Book book) {
        Book existing = repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));

        existing.setTitle(book.getTitle());
        existing.setAuthor(book.getAuthor());
        existing.setPrice(book.getPrice());
        existing.setPublishedDate(book.getPublishedDate());

        return repo.save(existing);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }
}

