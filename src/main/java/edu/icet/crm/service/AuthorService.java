package edu.icet.crm.service;

import edu.icet.crm.entity.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    void addAuthor(AuthorEntity authorEntity);
    List<AuthorEntity> getAllAuthor();
    void updateAuthor(AuthorEntity authorEntity);
    void deleteAuthor(Integer id);
    AuthorEntity searchAuthorById(Integer id);
}
