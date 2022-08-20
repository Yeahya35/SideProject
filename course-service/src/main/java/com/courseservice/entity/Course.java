package com.courseservice.entity;

import lombok.Data;

import javax.persistence.*;

@Table
@Data

@Entity(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String branch;

    private Boolean status;
}
