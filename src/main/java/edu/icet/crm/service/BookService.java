package edu.icet.crm.service;

import edu.icet.crm.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getAllBook();
    void updateBook(Book book);
    void deleteBook(Integer id);
    Book searchBookById(Integer id);
}
