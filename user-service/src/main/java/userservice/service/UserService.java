package userservice.service;

import org.springframework.stereotype.Service;
import userservice.dto.UserDTO;
import userservice.dto.UserRegisterDTO;
import userservice.entity.User;
import userservice.enums.Role;
import userservice.mapper.UserMapper;
import userservice.repository.UserRepository;

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
