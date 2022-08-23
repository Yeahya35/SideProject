package com.courseservice.service;

import com.courseservice.dto.CourseDTO;
import com.courseservice.entity.Course;
import com.courseservice.mapper.CourseMapper;
import com.courseservice.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    private final CourseMapper courseMapper;

    public CourseService(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }


    public CourseDTO save(CourseDTO courseDTO) {
        Course course = new Course();
        course.setBranch(courseDTO.getBranch());
        course.setName(courseDTO.getName());
        course.setStatus(Boolean.TRUE);
        return courseMapper.toDTO(courseRepository.save(course));
    }
}
