package com.example.jpa_exercise.repository;

import com.example.jpa_exercise.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
