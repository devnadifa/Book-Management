package com.example.BookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository; //jparepository -> library of pre-written DB methods
import com.example.BookApp.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{ //Book is the object that is saved, Integer is the data type of primary key
  public Book findBookByTitle(String title); //query method
  
}
