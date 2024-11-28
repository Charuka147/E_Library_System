package edu.icet.crm.service.impl;

import edu.icet.crm.entity.BookEntity;
import edu.icet.crm.model.Book;
import edu.icet.crm.repository.BookRepository;
import edu.icet.crm.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ModelMapper mapper;
    @Override
    public void addBook(Book book) {

        bookRepository.save(mapper.map(book, BookEntity.class));
    }

    @Override
    public List<Book> getAllBook() {
        List<Book> bookArrayList = new ArrayList<>();
        bookRepository.findAll().forEach(entityBook -> {
            bookArrayList.add(mapper.map(entityBook, Book.class));
        });
        return bookArrayList;
    }

    @Override
    public void updateBook(Book book) {

        bookRepository.save(mapper.map(book, BookEntity.class));
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book searchBookById(Integer id) {

        return mapper.map(bookRepository.findById(id), Book.class);
    }
}
