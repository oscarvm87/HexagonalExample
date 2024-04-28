package com.example.hexagonal.infrastructure.repository;

import com.example.hexagonal.application.repostiory.UserRepository;
import com.example.hexagonal.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo implements UserRepository {

    @Override
    public User findById(Long id) {
        return new User(1L,"name","password");
    }
}
