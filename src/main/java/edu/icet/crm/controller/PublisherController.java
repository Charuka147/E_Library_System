package edu.icet.crm.controller;

import edu.icet.crm.entity.AuthorEntity;
import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.model.Book;
import edu.icet.crm.model.Publisher;
import edu.icet.crm.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/publisher")
public class PublisherController {

    final PublisherService publisherService;

    @PostMapping("/save-publisher")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.addPublisher(publisher);
        System.out.println(publisher);
    }
    @GetMapping("/getAllPublisher")
    public List<Publisher> getAllPublisher()
    {
        return publisherService.getAllPublisher();
    }
    @PutMapping("/update-publisher")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePublisher(@RequestBody Publisher publisher)
    {
        publisherService.updatePublisher(publisher);
    }
    @DeleteMapping(path = "/delete-publisher/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePublisher(@PathVariable Integer id) {
        publisherService.deleteAuthor(id);
    }

    @GetMapping("/search-publisher/{id}")
    public Publisher getPublisherById(@PathVariable Integer id){
        return publisherService.searchPublisherById(id);
    }
}
