package com.example.Resources.repositories;

import com.example.Resources.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine,Long> {
}
