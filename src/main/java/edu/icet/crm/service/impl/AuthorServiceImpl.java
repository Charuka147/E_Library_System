package edu.icet.crm.service.impl;

import edu.icet.crm.entity.AuthorEntity;
import edu.icet.crm.model.Author;
import edu.icet.crm.repository.AuthorRepository;
import edu.icet.crm.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final ModelMapper mapper;

    @Override
    public void addAuthor(Author author) {
        authorRepository.save(mapper.map(author, AuthorEntity.class));
    }

    @Override
    public List<Author> getAllAuthor() {
        List<Author> authorArrayList = new ArrayList<>();
        authorRepository.findAll().forEach(entity -> {
            authorArrayList.add(mapper.map(entity, Author.class));
        });
        return authorArrayList;
    }

    @Override
    public void updateAuthor(Author author) {
        authorRepository.save(mapper.map(author, AuthorEntity.class));
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author searchAuthorById(Integer id) {
        return mapper.map(authorRepository.findById(id), Author.class);
    }
}
