package com.codekul.aprilspring29.manytomany.controller;

import com.codekul.aprilspring29.manytomany.entity.Student1;
import com.codekul.aprilspring29.manytomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("save")
    public  String saveStud(@RequestBody Student1 student1){
        studentRepo.save(student1);
        return "student saved";
    }
}
