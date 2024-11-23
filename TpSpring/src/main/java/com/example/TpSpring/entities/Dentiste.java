package com.example.TpSpring.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "dentistes")
public class Dentiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // hadi fach katkoun l relation f diagramme de class 1 1 fihoum bjouj
    @OneToOne
    @JoinColumn(name = "salleId")
    private Salle salle;




}
