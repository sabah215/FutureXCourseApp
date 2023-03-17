package com.futurex.services.FutureXCourseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping("/")
    public String getCoursesAppHome(){

        return "Course App Home";

    }
    @RequestMapping("/courses")
    public List<Course> getCourses(){

        return courseRepository.findAll();

    }
    @RequestMapping("/{id}")
    public Course CourseGetSpecificCourse(@PathVariable("id") BigInteger id){
        return courseRepository.getOne(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/courses")
    public void save(@RequestBody Course course){
        courseRepository.save(course);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="{id}")
    public void delete(@PathVariable BigInteger id){
        courseRepository.deleteById(id);
    }
}
