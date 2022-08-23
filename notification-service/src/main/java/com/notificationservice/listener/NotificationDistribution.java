/*
package com.notificationservice.listener;

import com.notificationservice.dto.EmailDTO;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class NotificationDistribution {

    @StreamListener(Sink.INPUT)
    public void onNotification(EmailDTO emailDTO) {
        System.out.println("Notification received, sending...");
        System.out.println(emailDTO.toString());
    }
}
*/
