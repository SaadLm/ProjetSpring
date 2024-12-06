package com.example.Resources.services;

import com.example.Resources.entities.Machine;
import com.example.Resources.repositories.MachineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineServiceImp implements MachineService {
    private final MachineRepository machineRepository;

    public MachineServiceImp(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }

    @Override
    public void create(Machine machine) {
    }

    @Override
    public void update(Machine machine, long id) {
    }

    @Override
    public void delete(long id) {
    }

    @Override
    public List<Machine> findAll() {
        return null;
    }
}
