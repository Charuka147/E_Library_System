package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {

    private Integer userId;
    private String userName;
    private String  phoneNumber;
    private String email;
    private String password;
}
