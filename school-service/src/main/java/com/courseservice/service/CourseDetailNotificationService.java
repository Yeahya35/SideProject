package com.courseservice.service;

import com.courseservice.dto.EmailDTO;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

import org.springframework.cloud.stream.messaging.Source;

@Service
@EnableBinding(Source.class)
public class CourseDetailNotificationService {

    private final Source source;

    public CourseDetailNotificationService(Source source) {
        this.source = source;
    }

    public void sendToQueue(EmailDTO emailDTO) {
        source.output().send(MessageBuilder.withPayload(emailDTO).build());
    }
}
