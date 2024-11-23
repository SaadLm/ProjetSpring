package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine,Long> {
}
