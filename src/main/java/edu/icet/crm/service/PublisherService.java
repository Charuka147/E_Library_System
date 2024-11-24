package edu.icet.crm.service;

import edu.icet.crm.entity.PublisherEntity;

import java.util.List;
import java.util.Optional;

public interface PublisherService {
    void addPublisher(PublisherEntity publisherEntity);
    List<PublisherEntity> getAllPublisher();
    void updatePublisher(PublisherEntity publisherEntity);
    void deleteAuthor(Integer id);
    Optional<PublisherEntity> searchPublisherById(Integer id);
}
