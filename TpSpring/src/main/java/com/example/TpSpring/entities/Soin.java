package com.example.TpSpring.entities;


import jakarta.persistence.*;
@Entity
@Table(name = "soins")
public class Soin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}