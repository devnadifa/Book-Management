package com.example.BookApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BookApp.Entity.Book;
import com.example.BookApp.Repository.BookRepository;

@Service
public class BookService {
  @Autowired //injects an instance of a class into another class. could use constructor injection
  BookRepository bookRepository;
  public Book addBook(Book book) {
    return bookRepository.save(book); //if ID is new, adds a new record
  }
  public Book getBookByName(String name) {
    return bookRepository.findBookByTitle(name);
  }
  public Book updateBook(Book book) {
    return bookRepository.save(book); //uses save() too because if ID already exists in updates existing record
  }
  public void deleteBook(Integer id) {
    bookRepository.deleteById(id);
  }
}
