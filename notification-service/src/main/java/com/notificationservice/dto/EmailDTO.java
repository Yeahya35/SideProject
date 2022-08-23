package com.notificationservice.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmailDTO {

    private String sendTo;

    private String body;

    private String subject;

}
