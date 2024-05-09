package com.codekul.aprilspring29.onetoone.repository;

import com.codekul.aprilspring29.onetoone.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
