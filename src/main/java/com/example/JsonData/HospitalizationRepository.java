package com.example.JsonData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalizationRepository extends JpaRepository<Hospitalization,Long> {
}