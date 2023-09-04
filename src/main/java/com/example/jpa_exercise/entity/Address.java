package com.example.jpa_exercise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToMany(mappedBy = "address", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Citizen> citizens = new ArrayList<>();

    public void addCitizen(Citizen citizen){
        citizens.add(citizen);
        citizen.setAddress(this);
    }

    public Address(String street, String city, String zip) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }
}