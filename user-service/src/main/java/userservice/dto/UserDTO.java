package userservice.dto;

import lombok.Data;
import userservice.enums.Role;

@Data
public class UserDTO {
    private int id;

    private String name;

    private String email;

    private Role role;

    private String phoneNumber;

    private Boolean status;
}
