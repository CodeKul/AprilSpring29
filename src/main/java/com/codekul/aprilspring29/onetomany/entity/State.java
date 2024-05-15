package com.codekul.aprilspring29.onetomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String stateCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    @JsonBackReference
    private Country country;
}
