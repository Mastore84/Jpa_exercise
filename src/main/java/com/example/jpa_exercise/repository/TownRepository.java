package com.example.jpa_exercise.repository;

import com.example.jpa_exercise.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownRepository extends JpaRepository<Town, Integer>{
}
