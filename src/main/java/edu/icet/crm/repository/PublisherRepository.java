package edu.icet.crm.repository;

import edu.icet.crm.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<PublisherEntity,Integer>{
}
