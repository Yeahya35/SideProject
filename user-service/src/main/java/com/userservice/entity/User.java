package com.userservice.entity;

import com.userservice.enums.Role;
import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String phoneNumber;

    private Boolean status;
}
