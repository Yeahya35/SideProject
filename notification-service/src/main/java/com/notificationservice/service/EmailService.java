package com.notificationservice.service;

import com.notificationservice.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public Boolean sendSimpleEmail(EmailDTO emailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("matrimtheraven@gmail.com");
        message.setTo(emailDTO.getSendTo());
        message.setText(emailDTO.getBody());
        message.setSubject(emailDTO.getSubject());

        mailSender.send(message);
        System.out.println("Mail Send...");
        return true;
    }
}
