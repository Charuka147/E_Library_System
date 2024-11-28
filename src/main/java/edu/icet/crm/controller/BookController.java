package edu.icet.crm.controller;

import edu.icet.crm.model.Book;
import edu.icet.crm.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    final BookService bookService;

    @PostMapping("/save-book")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody Book book) {
        bookService.addBook(book);
        System.out.println(book);
    }
    @GetMapping("/getAllBook")
    public List<Book> getAllBook()
    {
        return bookService.getAllBook();
    }
    @PutMapping("/update-book")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }
    @DeleteMapping(path = "/delete-book/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAuthor(@PathVariable Integer id) {
        bookService.deleteBook(id);
    }
    @GetMapping("/search-book/{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookService.searchBookById(id);
    }
}
