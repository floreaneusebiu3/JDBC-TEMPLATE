package com.eusebiu.take_a_sit.controller;

import com.eusebiu.take_a_sit.model.User;
import com.eusebiu.take_a_sit.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> readUsers() {
        return userService.readAllUsers();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable("userId") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void insertUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") Long id) {
        userService.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}
