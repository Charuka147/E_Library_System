package edu.icet.crm.service.impl;

import edu.icet.crm.entity.BorrowEntity;
import edu.icet.crm.model.Borrow;
import edu.icet.crm.repository.BorrowRepository;
import edu.icet.crm.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {

    private final BorrowRepository borrowRepository;
    private final ModelMapper mapper;

    @Override
    public void addBorrow(Borrow borrow) {
        borrowRepository.save(mapper.map(borrow, BorrowEntity.class));
    }

    @Override
    public List<Borrow> getAllBorrow() {
        List<Borrow> borrowArrayList = new ArrayList<>();
        borrowRepository.findAll().forEach(entityBorrow -> {
            borrowArrayList.add(mapper.map(entityBorrow, Borrow.class));
        });
        return borrowArrayList;
    }

    @Override
    public void updateBorrow(Borrow borrow) {
        borrowRepository.save(mapper.map(borrow, BorrowEntity.class));
    }
}
