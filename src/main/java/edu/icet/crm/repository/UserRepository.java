package edu.icet.crm.repository;

import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity> findById(Integer id);
}
