package com.codekul.aprilspring29.manytomany.repository;

import com.codekul.aprilspring29.manytomany.entity.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student1,Long> {
}
