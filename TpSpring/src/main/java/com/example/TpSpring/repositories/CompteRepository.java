package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
