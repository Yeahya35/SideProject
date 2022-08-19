package userservice.dto;

import lombok.Data;
import userservice.enums.Role;

@Data
public class UserRegisterDTO {

    private String name;

    private String email;

    private String phoneNumber;
}
