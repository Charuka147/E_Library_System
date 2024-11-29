package edu.icet.crm.model;

import edu.icet.crm.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Borrow {

    private Integer id;
    private LocalDate borrowDate;
    private LocalDate returnDate;

}
