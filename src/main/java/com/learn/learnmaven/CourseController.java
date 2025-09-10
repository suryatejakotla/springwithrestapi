package com.learn.learnmaven;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    private List<Course> courses = Arrays.asList(
            new Course(1,"aws","udemy"),
            new Course(2,"full stack","Great Learning"),
            new Course(3,"devops","Great Learning")
    );

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return courses;
    }

    @RequestMapping("/courses/{id}")
    public Course retrieveCourseById(@PathVariable int id) {
        return courses.stream()
                .filter(course -> id == course.getId()).toList().get(0);
//                .findFirst()
//                .orElse(null);
    }
}
