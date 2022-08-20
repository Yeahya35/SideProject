package com.courseservice.service;

import com.courseservice.dto.CourseDetailDTO;
import com.courseservice.entity.CourseDetail;
import com.courseservice.mapper.CourseDetailMapper;
import com.courseservice.repository.CourseDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseDetailService {

    private final CourseDetailRepository courseDetailRepository;

    private final CourseDetailMapper courseDetailMapper;

    public CourseDetailService(CourseDetailRepository courseDetailRepository, CourseDetailMapper courseDetailMapper) {
        this.courseDetailRepository = courseDetailRepository;
        this.courseDetailMapper = courseDetailMapper;
    }

    public CourseDetailDTO save(CourseDetailDTO courseDetailDTO) {
        CourseDetail courseDetail = courseDetailMapper.toEntity(courseDetailDTO);
        return courseDetailMapper.toDTO(courseDetailRepository.save(courseDetail));
    }
}
