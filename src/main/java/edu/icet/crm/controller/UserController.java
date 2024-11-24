package edu.icet.crm.controller;

import edu.icet.crm.entity.PublisherEntity;
import edu.icet.crm.entity.UserEntity;
import edu.icet.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    @PostMapping("/save-user")
    public void saveUser(@RequestBody UserEntity userEntity) {
        userService.addUser(userEntity);
        System.out.println(userEntity);
    }
    @GetMapping("/getAllUser")
    public List<UserEntity> getAllUser()
    {
        return userService.getAllUser();
    }
    @PutMapping("/update-user")
    public void updateUser(@RequestPart("user") UserEntity userEntity)
    {
        userService.updateUser(userEntity);
    }
    @DeleteMapping(path = "/delete-user/{id}")
    public void deleteUser(@PathVariable(value = "id")Integer id)
    {

        userService.deleteUser(id);
    }
}
