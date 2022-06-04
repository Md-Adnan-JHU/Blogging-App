package com.adn.service;

import java.util.Optional;

import com.adn.model.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User save(User user);
}
