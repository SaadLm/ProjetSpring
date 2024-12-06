package com.example.Resources.services;

import com.example.Resources.entities.Salle;

import com.example.Resources.repositories.SalleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalleServiceImp implements SalleService {
    private final SalleRepository salleRepository;
    @PersistenceContext
    private EntityManager entityManager;
    public SalleServiceImp(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public void create(Salle salle) {
        salleRepository.save(salle);
    }

    @Override
    public void update(Salle salle, long id) {
    }

    @Override
    public void delete(long id) {
    }

    @Override
    public List<Salle> findAll() {
        return null;
    }



}
