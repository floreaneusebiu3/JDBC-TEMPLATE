package com.eusebiu.take_a_sit.service;

import com.eusebiu.take_a_sit.model.User;
import com.eusebiu.take_a_sit.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> readAllUsers() {
        return userRepository.readAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.readById(id);
    }

    public int createUser(User user) {
        return userRepository.create(user);
    }

    public int updateUser(User user, Long id) {
        return userRepository.update(user, id);
    }

    public int deleteUser(Long id) {
        return userRepository.delete(id);
    }
}
