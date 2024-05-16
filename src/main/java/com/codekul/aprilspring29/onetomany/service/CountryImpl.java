package com.codekul.aprilspring29.onetomany.service;

import com.codekul.aprilspring29.onetomany.dto.CountryRequestDto;
import com.codekul.aprilspring29.onetomany.entity.Country;
import com.codekul.aprilspring29.onetomany.entity.State;
import com.codekul.aprilspring29.onetomany.repository.CountryRepo;
import com.codekul.aprilspring29.onetomany.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryImpl implements CountryService{

    @Autowired
    private CountryRepo countryRepo;

    @Autowired
    private StateRepo stateRepo;

    @Override
    public void saveCountry(CountryRequestDto country) {
        var country1 = new Country();
        country1.setName(country.getName());
        country1.setCountryCode(country.getCountryCode());
        countryRepo.save(country1);

        country.getState().forEach(s->{
            var state = new State();

            state.setName(s.getName());
            state.setStateCode(s.getStateCode());
            state.setCountry(country1);
            stateRepo.save(state);
        });

    }
}
