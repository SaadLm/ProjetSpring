package com.example.TpSpring.repositories;

import com.example.TpSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


// hna l te7t kandirou extends bach t3ref rasha raha repo w hadik Product hiya table li fel entity w Long houwa type d id dyal Product
public interface ProductRepository extends JpaRepository<Product,Long> {

}
