package com.courseservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity(name = "school")
public class CourseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int courseId;

    private int quota;
}
