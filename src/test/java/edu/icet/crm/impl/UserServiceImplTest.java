package edu.icet.crm.impl;


import edu.icet.crm.service.impl.UserServiceImpl;
import org.junit.Test;


import static org.hibernate.validator.internal.util.Contracts.assertTrue;
import static org.junit.Assert.assertFalse;


public class UserServiceImplTest {
    private final UserServiceImpl userService = new UserServiceImpl(null, null);

    @Test
    public void testIsValidPhoneNumber_ValidNumbers() {
        assertTrue(userService.isValidPhoneNumber("1234567890"), "10-digit number without country code should be valid");
        assertTrue(userService.isValidPhoneNumber("+911234567890"), "10-digit number with country code should be valid");
        assertTrue(userService.isValidPhoneNumber("+1-1234567890"), "Number with country code and hyphen should be valid");
        assertTrue(userService.isValidPhoneNumber("+1 1234567890"), "Number with country code and space should be valid");
    }

    @Test
    public void testIsValidPhoneNumber_InvalidNumbers() {
        assertFalse("Null phone number should be invalid", userService.isValidPhoneNumber(null));
        assertFalse("Empty phone number should be invalid", userService.isValidPhoneNumber(""));
        assertFalse("Number with fewer than 10 digits should be invalid", userService.isValidPhoneNumber("12345"));
        assertFalse("Number with more than 10 digits and no valid country code should be invalid", userService.isValidPhoneNumber("123456789012"));
        assertFalse("Phone number with alphabets should be invalid", userService.isValidPhoneNumber("+ABC1234567"));
    }


}
