package com.example.Resources.services;

import com.example.Resources.entities.Machine;

import java.util.List;

public interface MachineService {
    void create(Machine machine);
    void update(Machine machine, long id);
    void delete(long id);
    List<Machine> findAll();
}
