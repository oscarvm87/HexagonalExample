package com.example.hexagonal.infrastructure.rest.mapper;

import com.example.hexagonal.domain.User;
import com.example.hexagonal.domain.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO toDto(User source);
}
