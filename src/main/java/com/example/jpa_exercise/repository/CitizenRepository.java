package com.example.jpa_exercise.repository;

import com.example.jpa_exercise.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
}
