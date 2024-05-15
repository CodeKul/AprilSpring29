package com.codekul.aprilspring29.onetoone.controller;

import com.codekul.aprilspring29.onetoone.entity.Aadhar;
import com.codekul.aprilspring29.onetoone.entity.Person;
import com.codekul.aprilspring29.onetoone.repository.AadharRepository;
import com.codekul.aprilspring29.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private AadharRepository aadharRepository;

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("save")
    public String savePerson(@RequestBody Person person){

        personRepository.save(person);
        return "person saved..";

    }
}
