package edu.icet.crm.service.impl;

import edu.icet.crm.entity.AuthorEntity;
import edu.icet.crm.repository.AuthorRepository;
import edu.icet.crm.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    final AuthorRepository authorRepository;

    @Override
    public void addAuthor(AuthorEntity authorEntity) {
        authorRepository.save(authorEntity);
    }

    @Override
    public List<AuthorEntity> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public void updateAuthor(AuthorEntity authorEntity) {
        authorRepository.save(authorEntity);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Optional<AuthorEntity> searchAuthorById(Integer id) {
        return authorRepository.findById(id);
    }
}
