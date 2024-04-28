package com.example.hexagonal.application.repostiory;

import com.example.hexagonal.domain.User;

public interface UserRepository {
    public User findById(Long id);
}
