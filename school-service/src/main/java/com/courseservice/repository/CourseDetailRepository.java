package com.courseservice.repository;

import com.courseservice.entity.CourseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailRepository extends JpaRepository<CourseDetail, Integer> {


}
