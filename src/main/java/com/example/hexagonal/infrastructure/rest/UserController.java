package com.example.hexagonal.infrastructure.rest;

import com.example.hexagonal.application.FindUserByIdUseCase;
import com.example.hexagonal.domain.dto.UserDTO;
import com.example.hexagonal.infrastructure.rest.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserController {

    private FindUserByIdUseCase findUserByIdUseCase;

    private UserMapper userMapper;

    @GetMapping(value = "/status")
    public String status() {
        return "ready";
    }

    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return this.userMapper.toDto(this.findUserByIdUseCase.findById(id));
    }
}
