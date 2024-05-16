package com.codekul.aprilspring29.onetomany.repository;


import com.codekul.aprilspring29.onetomany.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<State,Long> {
}
