package edu.icet.crm.repository;

import edu.icet.crm.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Integer> {

}
