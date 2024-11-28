package edu.icet.crm.service;

import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.model.Publisher;

import java.util.List;
import java.util.Optional;

public interface PublisherService {
    void addPublisher(Publisher publisher);
    List<Publisher> getAllPublisher();
    void updatePublisher(Publisher publisher);
    void deleteAuthor(Integer id);
    Publisher searchPublisherById(Integer id);
}
