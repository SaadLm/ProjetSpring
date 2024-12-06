package com.example.Resources.services;

import com.example.Resources.entities.Salle;


import java.util.List;

public interface SalleService {
    void create(Salle salle);
    void update(Salle salle, long id);
    void delete(long id);
    List<Salle> findAll();

}
