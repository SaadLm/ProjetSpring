package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
