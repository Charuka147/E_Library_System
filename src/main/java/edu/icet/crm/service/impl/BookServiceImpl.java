package edu.icet.crm.service.impl;

import edu.icet.crm.entity.BookEntity;
import edu.icet.crm.repository.BookRepository;
import edu.icet.crm.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    final BookRepository bookRepository;
    @Override
    public void addBook(BookEntity bookEntity) {
        bookRepository.save(bookEntity);
    }

    @Override
    public List<BookEntity> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public void updateBook(BookEntity bookEntity) {
        bookRepository.save(bookEntity);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Optional<BookEntity> searchBookById(Integer id) {
        return bookRepository.findById(id);
    }
}
