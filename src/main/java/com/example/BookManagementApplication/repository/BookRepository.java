package com.example.BookManagementApplication.repository;

//package com.example.bookmanagement.repository;

import com.example.BookManagementApplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

