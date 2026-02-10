package com.example.BookApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BookApp.Entity.Book;
import com.example.BookApp.Repository.BookRepository;

@Service
public class BookService {
  @Autowired
  BookRepository bookRepository;
  public Book addBook(Book book) {
    return bookRepository.save(book);
  }
  public Book getBookByName(String name) {
    return bookRepository.findBookByTitle(name);
  }
  public Book updateBook(Book book) {
    return bookRepository.save(book);
  }
  public void deleteBook(Integer id) {
    bookRepository.deleteById(id);
  }
}
