package edu.icet.crm.controller;

import edu.icet.crm.model.Author;
import edu.icet.crm.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/author")
public class AuthorController {

    final AuthorService authorService;
    @PostMapping(path = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAuthor(@RequestBody Author author) {
       authorService.addAuthor(author);
    }
    @GetMapping("/getAllAuthor")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAuthor(@RequestBody Author author) {
        authorService.updateAuthor(author);
    }
    @DeleteMapping(path = "/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAuthor(@PathVariable Integer id) {
        authorService.deleteAuthor(id);
    }
    @GetMapping("/search/{id}")
    public Author getAuthorById(@PathVariable Integer id){
        return authorService.searchAuthorById(id);
    }

}
