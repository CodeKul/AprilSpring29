package com.codekul.aprilspring29.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepo extends JpaRepository<Student,Long> {

    Student findByNameAndAddressIgnoreCase(String name);
}
