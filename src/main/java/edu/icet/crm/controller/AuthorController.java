package edu.icet.crm.controller;

import edu.icet.crm.entity.AuthorEntity;
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
    public void saveAuthor(@RequestBody AuthorEntity authorEntity) {
       authorService.addAuthor(authorEntity);
        System.out.println(authorEntity);
    }
    @GetMapping("/getAllAuthor")
    public List<AuthorEntity> getAllAuthor() {
        return authorService.getAllAuthor();
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAuthor(@RequestBody AuthorEntity authorEntity) {
        authorService.updateAuthor(authorEntity);
    }
    @DeleteMapping(path = "/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAuthor(@PathVariable Integer id) {
        authorService.deleteAuthor(id);
    }
    @GetMapping("/search/{id}")
    public AuthorEntity getCustomerById(@PathVariable Integer id){
        return authorService.searchAuthorById(id);
    }

}
