package com.courseservice.controller;

import com.courseservice.dto.CourseDetailDTO;
import com.courseservice.service.CourseDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courseDetail")
public class CourseDetailController {

    private final CourseDetailService courseDetailService;

    public CourseDetailController(CourseDetailService courseDetailService) {
        this.courseDetailService = courseDetailService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CourseDetailDTO courseDetailDTO) {
        return new ResponseEntity<>(courseDetailService.save(courseDetailDTO), HttpStatus.CREATED);
    }

}
