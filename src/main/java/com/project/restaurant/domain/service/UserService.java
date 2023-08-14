package com.project.restaurant.domain.service;

import com.project.restaurant.domain.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    User getUserByUsername(String username);
    User save(User user);
    void updateUser(User user);
}
