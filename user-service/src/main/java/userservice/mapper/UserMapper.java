package userservice.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;
import userservice.dto.UserDTO;
import userservice.dto.UserRegisterDTO;
import userservice.entity.User;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {

    @Named("toDTO")
    UserDTO toDTO(User user);

    @Named("toEntity")
    User toEntity(UserDTO userDTO);

    @Named("registerToEntity")
    User registerToEntity(UserRegisterDTO userRegisterDTO);

    @IterableMapping(qualifiedByName = "toDTO")
    List<UserDTO> toUserDTOList(List<User> userList);

}
