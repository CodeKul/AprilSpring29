package com.codekul.aprilspring29.manytomany.controller;

import com.codekul.aprilspring29.manytomany.entity.Courses;
import com.codekul.aprilspring29.manytomany.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @PostMapping("save")
    public String saveCourse(@RequestBody Courses courses){
        courseRepo.save(courses);
        return "course saved.";
    }
}
