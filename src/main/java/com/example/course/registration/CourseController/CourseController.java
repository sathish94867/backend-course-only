package com.example.course.registration.CourseController;

import com.example.course.registration.CourseService.CourseService;
import com.example.course.registration.Model.Course;
import com.example.course.registration.Model.CoursrRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getallcourse(){
        return courseService.getallcourse();
    }
    @GetMapping("/courses/enroll")
    public List<CoursrRegister> enrollstd(){
        return courseService.enrollcourse();
    }
    @PostMapping("/courses/register")
    public String enrollcourse(@RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("coursename")String coursename){
        courseService.registercourse(name,email,coursename);
        return "Congragulation !!!   "+name  + "   enroll success for   "+coursename;
    }

}
