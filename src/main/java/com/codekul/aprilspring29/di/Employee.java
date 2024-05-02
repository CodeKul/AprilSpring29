package com.codekul.aprilspring29.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int id;

    private String name;

    public void show(){
        System.out.println("In show");
    }
}
