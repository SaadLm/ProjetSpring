package com.example.TpSpring.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
@Entity
@Table(name = "rendezvous")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
@JsonIdentityInfo(
        scope = Rendez_vous.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Rendez_vous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;



    @ManyToOne
    @JoinColumn(name = "idDentiste")
    private Dentiste dentiste;

    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;

}