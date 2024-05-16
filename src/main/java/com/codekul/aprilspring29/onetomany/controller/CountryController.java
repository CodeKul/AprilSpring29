package com.codekul.aprilspring29.onetomany.controller;

import com.codekul.aprilspring29.onetomany.dto.CountryRequestDto;
import com.codekul.aprilspring29.onetomany.entity.Country;
import com.codekul.aprilspring29.onetomany.repository.CountryRepo;
import com.codekul.aprilspring29.onetomany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("country")
public class CountryController {


    @Autowired
    private CountryService countryService;

    @PostMapping("save")
    public String saveCountry(@RequestBody CountryRequestDto country) {
        countryService.saveCountry(country);
        return "country saved..";
    }
}
