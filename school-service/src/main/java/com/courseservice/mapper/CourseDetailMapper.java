package com.courseservice.mapper;

import com.courseservice.dto.CourseDetailDTO;
import com.courseservice.entity.CourseDetail;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseDetailMapper {

    @Named("toDTO")
    CourseDetailDTO toDTO(CourseDetail courseDetail);

    @Named("toEntity")
    CourseDetail toEntity(CourseDetailDTO courseDetailDTO);

    @IterableMapping(qualifiedByName = "toDTO")
    List<CourseDetailDTO> toDTOList(List<CourseDetail> courseDetailList);
}
