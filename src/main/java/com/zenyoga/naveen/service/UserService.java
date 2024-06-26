package com.zenyoga.naveen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenyoga.naveen.model.User;
import com.zenyoga.naveen.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean addUser(User ue) {
        userRepository.save(ue);
        return true;
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        } else {
            // Handle the case when the user with the given id doesn't exist
            return null;
        }
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
