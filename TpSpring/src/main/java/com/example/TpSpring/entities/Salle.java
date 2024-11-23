package com.example.TpSpring.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "salles")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
@JsonIdentityInfo(
        scope = Salle.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String SalleName;

    // jointure bidirectionelle
    @OneToMany(mappedBy = "salle")
    List<Machine> machines;

}
