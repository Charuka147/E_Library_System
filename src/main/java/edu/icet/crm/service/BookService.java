package edu.icet.crm.service;

import edu.icet.crm.entity.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void addBook(BookEntity bookEntity);
    List<BookEntity> getAllBook();
    void updateBook(BookEntity bookEntity);
    void deleteBook(Integer id);
    Optional<BookEntity> searchBookById(Integer id);
}
