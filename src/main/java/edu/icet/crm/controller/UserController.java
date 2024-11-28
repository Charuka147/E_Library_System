package edu.icet.crm.controller;

import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.entity.UserEntity;
import edu.icet.crm.model.User;
import edu.icet.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    @PostMapping("/save-user")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.addUser(user);
        System.out.println(user);
    }
    @GetMapping("/getAllUser")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }
    @PutMapping("/update-user")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
    }
    @DeleteMapping(path = "/delete-user/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
    @GetMapping("/search-user /{id}")
    public User getCustomerById(@PathVariable Integer id){
        return userService.searchUserById(id);
    }
}
