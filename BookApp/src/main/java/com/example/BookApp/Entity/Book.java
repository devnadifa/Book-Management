package com.example.BookApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //converts Book into entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
  @Id
  @GeneratedValue //automatic add & increment this entity
  private Integer id;
  private String title;
  private String author;
  private String genre;


  
}
