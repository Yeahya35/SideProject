package com.notificationservice.service;

import com.notificationservice.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@EnableBinding(Sink.class)
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;
    @StreamListener(Sink.INPUT)
    public void sendSimpleEmail(EmailDTO emailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("matrimtheraven@gmail.com");
        message.setTo(emailDTO.getSendTo());
        message.setText(emailDTO.getBody());
        message.setSubject(emailDTO.getSubject());

        mailSender.send(message);
        System.out.println("Mail Send...");
    }
}
