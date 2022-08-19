package com.userservice.service;

import com.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.userservice.dto.UserDTO;
import com.userservice.dto.UserRegisterDTO;
import com.userservice.entity.User;
import com.userservice.enums.Role;
import com.userservice.mapper.UserMapper;

@Service
public class UserService {

    private final UserMapper userMapper;

    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public UserDTO save(UserRegisterDTO userRegisterDTO) {

        User user = userMapper.registerToEntity(userRegisterDTO);
        user.setRole(Role.ROLE_USER);
        user.setStatus(Boolean.TRUE);

        return userMapper.toDTO(userRepository.save(user));
    }
}
