package com.notificationservice.dto;

import lombok.Data;

@Data
public class EmailDTO {

    private String sendTo;

    private String body;

    private String subject;

}
