package edu.icet.crm.controller;

import edu.icet.crm.entity.AuthorEntity;
import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/publisher")
public class PublisherController {

    final PublisherService publisherService;

    @PostMapping("/save-publisher")
    public void savePublisher(@RequestBody PublisherEntity publisherEntity) {
        publisherService.addPublisher(publisherEntity);
        System.out.println(publisherEntity);
    }
    @GetMapping("/getAllPublisher")
    public List<PublisherEntity> getAllPublisher()
    {
        return publisherService.getAllPublisher();
    }
    @PutMapping("/update-publisher")
    public void updatePublisher(@RequestPart("publisher") PublisherEntity publisherEntity)
    {
        publisherService.updatePublisher(publisherEntity);
    }
    @DeleteMapping(path = "/delete-publisher/{id}")
    public void deletePublisher(@PathVariable(value = "id")Integer id)
    {

        publisherService.deleteAuthor(id);
    }
}
