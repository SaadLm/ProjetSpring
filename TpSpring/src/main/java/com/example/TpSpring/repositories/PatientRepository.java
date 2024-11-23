package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
