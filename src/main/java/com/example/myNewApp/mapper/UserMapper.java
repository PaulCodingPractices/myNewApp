package com.example.myNewApp.mapper;


import com.example.myNewApp.dto.UserDTO;
import com.example.myNewApp.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User user);

    User toEntity(UserDTO userDto);

    List<UserDTO> toDtoList(List<User> userList);

    List<User> toEntityList(List<UserDTO> userDtoList);
}
