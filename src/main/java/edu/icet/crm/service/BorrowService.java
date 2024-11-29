package edu.icet.crm.service;

import edu.icet.crm.model.Borrow;

import java.util.List;

public interface BorrowService {
    void addBorrow(Borrow borrow);
    List<Borrow> getAllBorrow();
    void updateBorrow(Borrow borrow);
}
