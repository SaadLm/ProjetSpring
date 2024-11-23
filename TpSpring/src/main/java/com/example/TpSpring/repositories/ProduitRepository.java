package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Product,Long> {
}
