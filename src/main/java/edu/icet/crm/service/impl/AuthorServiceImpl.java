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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final ModelMapper mapper;

    @Override
    public void addAuthor(AuthorEntity authorEntity) {
        authorRepository.save(mapper.map(authorEntity, AuthorEntity.class));
    }

    @Override
    public List<AuthorEntity> getAllAuthor() {
        List<AuthorEntity> authorArrayList = new ArrayList<>();
        authorRepository.findAll().forEach(authorEntity -> {
            authorArrayList.add(mapper.map(authorEntity, AuthorEntity.class));
        });
        return authorArrayList;
    }

    @Override
    public void updateAuthor(AuthorEntity authorEntity) {
        authorRepository.save(mapper.map(authorEntity, AuthorEntity.class));
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }

    @Override
    public AuthorEntity searchAuthorById(Integer id) {
        return mapper.map(authorRepository.findById(id), AuthorEntity.class);
    }
}
