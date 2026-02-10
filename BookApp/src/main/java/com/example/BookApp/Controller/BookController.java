package com.example.BookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.BookApp.Entity.Book;
import com.example.BookApp.Service.BookService;

@RestController //tells Spring this is a controller, and every method returns JSON rather than trying to render a HTML page
@RequestMapping("/book/v1") //base path i.e start with '.../book/v1'
public class BookController {
  private final BookService bookService;
  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @PostMapping("/addBook") //create
  //ResponseEntity -> represents HTTP response i.e status code, headers, body. Book is the data inside the reponse
  public ResponseEntity<Book> addBook(@RequestBody Book book) {
    Book savedBook = bookService.addBook(book);
    return ResponseEntity.ok(savedBook);

  } //@RequestBody(used in add & update) -> binds HTTP request(JSON/XML) to Book object

  @GetMapping("/getBook/{bookName}") //read
  public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name) {
    final Book bookByName = bookService.getBookByName(name);
    return ResponseEntity.ok(bookByName);

  } //@PathVariable(get & delete) -> pulls data directly out of URL

  @PutMapping("/updateBook") //update
  public ResponseEntity<Book> updateBook(@RequestBody Book book) {
    Book updatedBook = bookService.updateBook(book);
    return ResponseEntity.ok(updatedBook);

  }

  @DeleteMapping("/deleteBook/{id}") //delete
  public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id) {
    bookService.deleteBook(id);
    return ResponseEntity.ok().build();

  }


}
