package com.example.Pam_web_api.repositories;

import com.example.Pam_web_api.entities.Dentiste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentisteRepository extends JpaRepository<Dentiste,Long> {
}
