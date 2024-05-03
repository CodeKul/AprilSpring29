package com.codekul.aprilspring29.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("save")
    public  String saveStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "student saved successfully";
    }

    @GetMapping("list")
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    @GetMapping("list/{id}")
    public Optional<Student> getStudent(@PathVariable("id") Long id) {
        return studentRepo.findById(id);
    }

    @PutMapping("update")
    public String updateStudent(@RequestBody Student student) {
        studentRepo.save(student);
        return "student update successfully";
    }

    @PutMapping("update1")
    public String updateStudent1(@RequestBody Student student) {

        Optional<Student> student1 = studentRepo.findById(student.getId());
        student1.get().setAddress(student.getAddress());
        student1.get().setName(student.getName());
        studentRepo.save(student1.get());
        return "student update successfully";
    }

    @DeleteMapping("delete")
    public String delete(@RequestBody Student student) {
        studentRepo.delete(student);
        return "student deleted successfully";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        studentRepo.deleteById(id);
        return "student deleted successfully";
    }

    @DeleteMapping("deleteAllByIds/{id}")
    public String delete(@PathVariable List<Long> id) {
        studentRepo.deleteAllById(id);
        return "student deleted successfully";
    }

    @GetMapping("findBy/{name}")
    public Student delete(@PathVariable String name) {
        return studentRepo.findByNameAndAddressIgnoreCase(name);
    }


}
