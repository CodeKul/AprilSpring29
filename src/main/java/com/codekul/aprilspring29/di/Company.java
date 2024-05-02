package com.codekul.aprilspring29.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    @Autowired
    private Employee employee;


//    public Company(Employee employee) {
//        this.employee = employee;
//    }

//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public void display(){
        employee.show();
    }
}
