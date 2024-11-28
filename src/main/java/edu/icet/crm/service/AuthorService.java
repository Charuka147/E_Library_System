package edu.icet.crm.service;

import edu.icet.crm.model.Author;

import java.util.List;

public interface AuthorService {
    void addAuthor(Author author);
    List<Author> getAllAuthor();
    void updateAuthor(Author author);
    void deleteAuthor(Integer id);
    Author searchAuthorById(Integer id);
}
