package edu.icet.crm.service;

import edu.icet.crm.model.Publisher;

import java.util.List;

public interface PublisherService {
    void addPublisher(Publisher publisher);
    List<Publisher> getAllPublisher();
    void updatePublisher(Publisher publisher);
    void deleteAuthor(Integer id);
    Publisher searchPublisherById(Integer id);
}
