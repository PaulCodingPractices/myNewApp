package com.example.myNewApp.service;

import com.example.myNewApp.dto.UserDTO;
import com.example.myNewApp.entity.User;
import com.example.myNewApp.mapper.UserMapper;
import com.example.myNewApp.repositories.UserRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserDTO> getAllUsers() {
        List<User> products = userRepository.findAll();
        return userMapper.toDtoList(products);
    }
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
        return userMapper.toDto(user);
    }
}
