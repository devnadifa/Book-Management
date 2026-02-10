package com.example.BookApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //creates a table names Book in H2 DB
@Data // automatically generates setters, getters, toString(), handles book object comparison
@NoArgsConstructor //JPA uses it to create onjects when it pulls data from DB
@AllArgsConstructor //creates constructor using all fields i.e title
public class Book {
  @Id //marks it as the primary key
  @GeneratedValue //auto-increment ID
  private Integer id; //uses Integer & not int because Integer can be null & when a book is created & ID is null, JPA knows a value hasn't been assigned yet by DB
  private String title;
  private String author;
  private String genre;


  
}
