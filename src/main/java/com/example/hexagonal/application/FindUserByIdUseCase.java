package com.example.hexagonal.application;

import com.example.hexagonal.application.repostiory.UserRepository;
import com.example.hexagonal.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindUserByIdUseCase {

    private UserRepository userRepository;

    public User findById(Long id) {
        return this.userRepository.findById(id);
    }
}
