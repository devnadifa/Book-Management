package com.example.BookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BookApp.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
  public Book findBookByTitle(String title);
  
}
