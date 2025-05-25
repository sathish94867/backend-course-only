package com.example.course.registration.CourseService;

import com.example.course.registration.CourseRepository.CourseRegisterRepo;
import com.example.course.registration.CourseRepository.CourseRepository;
import com.example.course.registration.Model.Course;
import com.example.course.registration.Model.CoursrRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CourseRegisterRepo courseRegisterRepos;
    public List<Course> getallcourse() {
    return courseRepository.findAll();
    }

    public List<CoursrRegister> enrollcourse() {
        return courseRegisterRepos.findAll();

    }

    public void registercourse(String name, String email, String coursename) {
        CoursrRegister coursrRegister=new CoursrRegister(name,email,coursename);
        courseRegisterRepos.save(coursrRegister);
    }
}
