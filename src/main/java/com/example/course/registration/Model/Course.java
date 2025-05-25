package com.example.course.registration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
   private int courseid;
   private  String coursename;
   private String coursetrainer;
   private int durationweek;


    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursetrainer() {
        return coursetrainer;
    }

    public void setCoursetrainer(String coursetrainer) {
        this.coursetrainer = coursetrainer;
    }

    public int getDurationweek() {
        return durationweek;
    }

    public void setDurationweek(int durationweek) {
        this.durationweek = durationweek;
    }
}
