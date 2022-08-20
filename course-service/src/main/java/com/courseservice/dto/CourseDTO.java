package com.courseservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseDTO {
    private int id;

    private String name;

    private String branch;

    private Boolean status;
}
