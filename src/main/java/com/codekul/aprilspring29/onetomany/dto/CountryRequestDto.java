package com.codekul.aprilspring29.onetomany.dto;

import com.codekul.aprilspring29.onetomany.entity.State;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class CountryRequestDto {

    private Long id;

    private String name;

    private String countryCode;

    private Set<State> state;
}
