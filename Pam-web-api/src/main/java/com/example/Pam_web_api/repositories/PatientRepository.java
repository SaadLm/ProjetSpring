package com.example.Pam_web_api.repositories;

import com.example.Pam_web_api.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
