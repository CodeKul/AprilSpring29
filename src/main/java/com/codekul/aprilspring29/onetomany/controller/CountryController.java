package com.codekul.aprilspring29.onetomany.controller;

import com.codekul.aprilspring29.onetomany.dto.CountryRequestDto;
import com.codekul.aprilspring29.onetomany.entity.Country;
import com.codekul.aprilspring29.onetomany.repository.CountryRepo;
import com.codekul.aprilspring29.onetomany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("country")
public class CountryController {


    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryRepo countryRepo;

    @PostMapping("save")
    public String saveCountry(@RequestBody CountryRequestDto country) {
        countryService.saveCountry(country);
        return "country saved..";
    }

    @GetMapping("getCountry/{id}/{name}")
    public List<Country> saveCountry(@PathVariable Long id, @PathVariable String name) {
        return countryRepo.findByIdAndName(id, name);
    }
    @GetMapping("getFunctionData")
    public Long getFunctionData(@RequestParam Long a,@RequestParam Long b) {
        return countryRepo.getFunctionData(a,b);
    }
}
