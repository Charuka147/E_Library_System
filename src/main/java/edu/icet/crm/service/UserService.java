package edu.icet.crm.service;

import edu.icet.crm.entity.BookEntity;
import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(UserEntity userEntity);
    List<UserEntity> getAllUser();
    void updateUser(UserEntity userEntity);
    void deleteUser(Integer id);
    Optional<UserEntity> searchUserById(Integer id);
}
