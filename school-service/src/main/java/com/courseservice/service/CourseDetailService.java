package com.courseservice.service;

import com.courseservice.dto.CourseDetailDTO;
import com.courseservice.dto.EmailDTO;
import com.courseservice.entity.CourseDetail;
import com.courseservice.mapper.CourseDetailMapper;
import com.courseservice.repository.CourseDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseDetailService {

    private final CourseDetailRepository courseDetailRepository;

    private final CourseDetailMapper courseDetailMapper;

    private final CourseDetailNotificationService courseDetailNotificationService;

    public CourseDetailService(CourseDetailRepository courseDetailRepository, CourseDetailMapper courseDetailMapper,
                               CourseDetailNotificationService courseDetailNotificationService) {
        this.courseDetailRepository = courseDetailRepository;
        this.courseDetailMapper = courseDetailMapper;
        this.courseDetailNotificationService = courseDetailNotificationService;
    }


    public CourseDetailDTO save(CourseDetailDTO courseDetailDTO) {
        CourseDetail courseDetail = courseDetailMapper.toEntity(courseDetailDTO);
        EmailDTO emailDTO = new EmailDTO();
        String body = "The course with id " + courseDetailDTO.getCourseId() + " with quota " + courseDetailDTO.getQuota() + " added to system.";
        emailDTO.setBody(body);
        emailDTO.setSubject("COURSE ADDITION");
        emailDTO.setSendTo("yahyaeren35@hotmail.com");
        courseDetailNotificationService.sendToQueue(emailDTO);
        return courseDetailMapper.toDTO(courseDetailRepository.save(courseDetail));
    }
}
