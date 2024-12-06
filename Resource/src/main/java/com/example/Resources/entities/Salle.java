package com.example.Resources.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

}