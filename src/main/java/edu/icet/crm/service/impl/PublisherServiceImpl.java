package edu.icet.crm.service.impl;

import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.model.Publisher;
import edu.icet.crm.repository.PublisherRepository;
import edu.icet.crm.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;
    private final ModelMapper mapper;
    @Override
    public void addPublisher(Publisher publisher) {
        publisherRepository.save(mapper.map(publisher, PublisherEntity.class));
    }

    @Override
    public List<Publisher> getAllPublisher() {
        List<Publisher> publisherArrayList = new ArrayList<>();
        publisherRepository.findAll().forEach(publisherentity -> {
            publisherArrayList.add(mapper.map(publisherentity, Publisher.class));
        });
        return publisherArrayList;
    }

    @Override
    public void updatePublisher(Publisher publisher) {
        publisherRepository.save(mapper.map(publisher, PublisherEntity.class));
    }

    @Override
    public void deleteAuthor(Integer id) {
        publisherRepository.deleteById(id);
    }

    @Override
    public Publisher searchPublisherById(Integer id) {
        return mapper.map(publisherRepository.findById(id), Publisher.class);
    }
}
