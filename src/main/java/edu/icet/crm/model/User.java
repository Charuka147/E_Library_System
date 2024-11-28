package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {

    private Integer userId;
    //@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "User name must contain only letters and numbers")
    private String userName;
//    @NotNull(message = "Phone number cannot be null")
//    @Pattern(
//            regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$",
//            message = "Phone number must be valid and contain 10 digits, optionally prefixed by a country code"
//    )
    private Integer phoneNumber;
    private String email;
    private String password;
}
