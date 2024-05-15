package com.codekul.aprilspring29.onetomany.repository;

import com.codekul.aprilspring29.onetomany.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Long> {
}
