package com.medicalAssistant.service;

import com.medicalAssistant.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
