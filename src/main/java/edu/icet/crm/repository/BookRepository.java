package edu.icet.crm.repository;

import edu.icet.crm.entity.BookEntity;
import edu.icet.crm.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {
    Optional<BookEntity> findById(Integer id);
}
