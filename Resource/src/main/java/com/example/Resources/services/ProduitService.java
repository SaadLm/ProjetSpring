package com.example.Resources.services;

import com.example.Resources.entities.Produit;

import java.util.List;

public interface ProduitService {
    void create(Produit produit);
    void update(Produit produit, long id);
    void delete(long id);
    List<Produit> findAll();
}
