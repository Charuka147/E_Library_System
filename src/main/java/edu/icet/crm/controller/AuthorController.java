package edu.icet.crm.controller;

import edu.icet.crm.entity.AuthorEntity;
import edu.icet.crm.model.Author;
import edu.icet.crm.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/author")
public class AuthorController {

    final AuthorService authorService;
    @PostMapping(path = "/save")
    public void saveAuthor(@RequestBody AuthorEntity authorEntity)
    {
       authorService.addAuthor(authorEntity);
        System.out.println(authorEntity);
    }
    @GetMapping("/getAllAuthor")
    public List<AuthorEntity> getAllAuthor()
    {
        return authorService.getAllAuthor();
    }
    @PutMapping("/update")
    public void updateAuthor(@RequestPart("author") AuthorEntity authorEntity)
    {
        authorService.updateAuthor(authorEntity);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteAuthor(@PathVariable(value = "id")Integer id)
    {
        authorService.deleteAuthor(id);
    }

}
