package com.codekul.aprilspring29.onetomany.controller;

import com.codekul.aprilspring29.onetomany.entity.Country;
import com.codekul.aprilspring29.onetomany.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("country")
public class CountryController {

    @Autowired
    private CountryRepo countryRepo;

    @PostMapping("save")
    public String saveCountry(@RequestBody Country country) {
        countryRepo.save(country);
        return "person saved..";
    }
}
