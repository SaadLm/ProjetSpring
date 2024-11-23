package com.example.TpSpring.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;


@Entity
@Table(name = "documents")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
//     hadi li lte7t bach mayb9ach yloopi bach yjib list d produits
@JsonIdentityInfo(
        scope = Document.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;


}