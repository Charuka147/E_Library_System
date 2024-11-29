package edu.icet.crm.service;

import edu.icet.crm.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUser();
    void updateUser(User user);
    void deleteUser(Integer id);
    User searchUserById(Integer id);
    boolean isValidPhoneNumber(String phoneNumber);
}
