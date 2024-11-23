package com.example.TpSpring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "comptes")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role role;


}
