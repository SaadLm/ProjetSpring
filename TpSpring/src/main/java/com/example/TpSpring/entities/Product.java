package com.example.TpSpring.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    // here is the 'jointure'
    @ManyToOne
    @JoinColumn(name="idCategory")
    private Category category;

}
