package edu.icet.crm.service.impl;

import edu.icet.crm.entity.UserEntity;
import edu.icet.crm.model.User;
import edu.icet.crm.repository.UserRepository;
import edu.icet.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;
    private static final String PHONE_NUMBER_REGEX = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
    @Override
    public void addUser(User user) {
        if (isValidPhoneNumber(user.getPhoneNumber())) {
            throw new IllegalArgumentException("Phone number must be valid and contain 10 digits, optionally prefixed by a country code");
        }
        userRepository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public List<User> getAllUser() {
        List<User> userArrayList = new ArrayList<>();
        userRepository.findAll().forEach(userentity -> {
            userArrayList.add(mapper.map(userentity, User.class));
        });
        return userArrayList;
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User searchUserById(Integer id) {
        return mapper.map(userRepository.findById(id), User.class);
    }

    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }
}
