package com.userservice.controller;

import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.userservice.dto.UserRegisterDTO;
@RestController
@RequestMapping("/main")
public class UserController {

    private final UserService userService;

    @Value("${server.port}")
    private String port;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserRegisterDTO userRegisterDTO) {
        return new ResponseEntity<>(userService.save(userRegisterDTO), HttpStatus.CREATED);
    }

    @GetMapping("/port")
    public String getPort() {
        return port;
    }
}
