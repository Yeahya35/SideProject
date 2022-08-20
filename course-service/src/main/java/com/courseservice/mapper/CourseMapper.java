package com.courseservice.mapper;

import ch.qos.logback.core.read.ListAppender;
import com.courseservice.dto.CourseDTO;
import com.courseservice.entity.Course;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    @Named("toDTO")
    CourseDTO toDTO(Course course);

    @Named("toEntity")
    Course toEntity(CourseDTO courseDTO);

    @IterableMapping(qualifiedByName = "toDTO")
    List<CourseDTO> toDTOList(List<Course> courseList);


}
