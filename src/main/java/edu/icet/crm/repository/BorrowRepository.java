package edu.icet.crm.repository;

import edu.icet.crm.entity.BorrowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<BorrowEntity,Integer> {
}
