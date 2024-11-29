package edu.icet.crm.controller;

import edu.icet.crm.model.Author;
import edu.icet.crm.model.Borrow;
import edu.icet.crm.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/borrow")
public class BorrowController {

    private final BorrowService borrowService;

    @PostMapping(path = "/save-borrow")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBorrow(@RequestBody Borrow borrow) {
        borrowService.addBorrow(borrow);
    }
    @PutMapping("/update-borrow")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBorrow(@RequestBody Borrow borrow) {
        borrowService.updateBorrow(borrow);
    }
    @GetMapping("/getAllBorrow")
    public List<Borrow> getAllBorrow() {
        return borrowService.getAllBorrow();
    }
}
