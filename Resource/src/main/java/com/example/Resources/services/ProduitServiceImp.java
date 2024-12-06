package com.example.Resources.services;

import com.example.Resources.entities.Produit;
import com.example.Resources.repositories.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImp implements ProduitService {
    private final ProduitRepository produitRepository;

    public ProduitServiceImp(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public void create(Produit produit) {
    }

    @Override
    public void update(Produit produit, long id) {
    }

    @Override
    public void delete(long id) {
    }

    @Override
    public List<Produit> findAll() {
        return null;
    }
}
