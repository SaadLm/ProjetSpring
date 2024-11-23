package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Dentiste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentisteRepository extends JpaRepository<Dentiste,Long> {
}
