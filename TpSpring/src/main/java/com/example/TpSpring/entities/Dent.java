package com.example.TpSpring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "dents")
public class Dent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}