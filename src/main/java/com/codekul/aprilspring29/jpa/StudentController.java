package com.codekul.aprilspring29.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @GetMapping("findBy/{name}/{address}")
    public Student delete(@PathVariable String name, @PathVariable("address") String address) {
        return studentRepo.findByNameAndAddressIgnoreCase(name, address);
    }

    @GetMapping("findByActive")
    public List<Student> findByActiveFalse() {
        return studentRepo.findByActiveFalse();
    }

    @GetMapping("findByAgeNotIn/{age}")
    public List<Student> findByAgeNotIn(@PathVariable("age") List<Integer> age) {
        return studentRepo.findByAgeNotIn(age);
    }

    @GetMapping("findByNameNot/{name}")
    public List<Student> findByNameNotIn(@PathVariable("name") String name) {
        return studentRepo.findByNameNot(name);
    }

    @GetMapping("findByDate/{startDate}/{toDate}")
    public List<Student> findByNameNotIn(@PathVariable("startDate") LocalDate startDate, @PathVariable("toDate") LocalDate toDate) {
        return studentRepo.findByDobBetween(startDate, toDate);
    }
   @GetMapping("findByAgeLessThan")
    public List<Student> findByNameNotIn(@RequestParam("age") Integer age) {
        return studentRepo.findByAgeLessThan(age);
    }


}
