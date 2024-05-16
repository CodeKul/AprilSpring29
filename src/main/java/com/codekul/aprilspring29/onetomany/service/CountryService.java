package com.codekul.aprilspring29.onetomany.service;

import com.codekul.aprilspring29.onetomany.dto.CountryRequestDto;
import com.codekul.aprilspring29.onetomany.entity.Country;

public interface CountryService {

    void saveCountry(CountryRequestDto country);
}
