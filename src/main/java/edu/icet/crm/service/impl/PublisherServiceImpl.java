package edu.icet.crm.service.impl;

import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.repository.PublisherRepository;
import edu.icet.crm.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    final PublisherRepository publisherRepository;
    @Override
    public void addPublisher(PublisherEntity publisherEntity) {
        publisherRepository.save(publisherEntity);
    }

    @Override
    public List<PublisherEntity> getAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public void updatePublisher(PublisherEntity publisherEntity) {
        publisherRepository.save(publisherEntity);
    }

    @Override
    public void deleteAuthor(Integer id) {
        publisherRepository.deleteById(id);
    }

    @Override
    public Optional<PublisherEntity> searchPublisherById(Integer id) {
        return publisherRepository.findById(id);
    }
}
