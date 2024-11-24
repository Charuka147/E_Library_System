package edu.icet.crm.controller;

import edu.icet.crm.entity.BookEntity;
import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    final BookService bookService;

    @PostMapping("/save-book")
    public void saveBook(@RequestBody BookEntity bookEntity) {
        bookService.addBook(bookEntity);
        System.out.println(bookEntity);
    }
    @GetMapping("/getAllBook")
    public List<BookEntity> getAllBook()
    {
        return bookService.getAllBook();
    }
    @PutMapping("/update-book")
    public void updateBook(@RequestPart("book") BookEntity bookEntity)
    {
        bookService.updateBook(bookEntity);
    }
    @DeleteMapping(path = "/delete-book/{id}")
    public void deleteAuthor(@PathVariable(value = "id")Integer id)
    {

        bookService.deleteBook(id);
    }
}
