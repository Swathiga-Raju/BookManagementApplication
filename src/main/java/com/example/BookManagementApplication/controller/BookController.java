package com.example.BookManagementApplication.controller;



import com.example.BookManagementApplication.entity.Book;
import com.example.BookManagementApplication.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService repo;

    public BookController(BookService service) {
        this.repo = service;
    }

    @PostMapping("/add")
    public Book add(@RequestBody Book book) {
        return repo.addBook(book);
    }

    @GetMapping("/get")
    public List<Book> getAll() {
        return repo.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return repo.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        return repo.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteBook(id);
        return "Book Deleted Successfully";
    }
}
