package com.notificationservice.controller;

import com.notificationservice.dto.EmailDTO;
import com.notificationservice.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseEntity<?> send(@RequestBody EmailDTO emailDTO) {
        emailService.sendSimpleEmail(emailDTO);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
