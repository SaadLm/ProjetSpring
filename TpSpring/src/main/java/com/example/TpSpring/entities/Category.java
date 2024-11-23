package com.example.TpSpring.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "categories")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
//     hadi li lte7t bach mayb9ach yloopi bach yjib list d produits
@JsonIdentityInfo(
        scope = Category.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "category")
    List<Product> produits;








}