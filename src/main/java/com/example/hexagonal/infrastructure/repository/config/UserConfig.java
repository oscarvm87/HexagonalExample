package com.example.hexagonal.infrastructure.repository.config;

import com.example.hexagonal.infrastructure.rest.mapper.UserMapper;
import com.example.hexagonal.infrastructure.rest.mapper.UserMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserMapper userMapper() {
        return new UserMapperImpl();
    }
}
