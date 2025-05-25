package com.example.course.registration.CourseRepository;

import com.example.course.registration.Model.CoursrRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisterRepo extends JpaRepository<CoursrRegister,Integer> {

}

