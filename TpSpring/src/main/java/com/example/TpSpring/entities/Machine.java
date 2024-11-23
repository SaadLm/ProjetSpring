package com.example.TpSpring.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "machines")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
@JsonIdentityInfo(
        scope = Machine.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameMachine;

    @ManyToOne
    @JoinColumn(name = "idSalle")
    private Salle salle;


}
