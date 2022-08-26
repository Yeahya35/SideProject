package com.userservice.controller;

import com.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.userservice.dto.UserRegisterDTO;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    private final UserService userService;

    public ProfileController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserRegisterDTO userRegisterDTO) {
        return new ResponseEntity<>(userService.save(userRegisterDTO), HttpStatus.CREATED);
    }
}
