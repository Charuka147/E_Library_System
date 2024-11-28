package edu.icet.crm.service;

import edu.icet.crm.entity.BookEntity;
import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.entity.UserEntity;
import edu.icet.crm.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);
    List<User> getAllUser();
    void updateUser(User user);
    void deleteUser(Integer id);
    User searchUserById(Integer id);
}
