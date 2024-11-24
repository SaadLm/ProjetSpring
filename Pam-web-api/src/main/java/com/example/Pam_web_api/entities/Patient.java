package com.example.Pam_web_api.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "patients")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
@JsonIdentityInfo(
        scope = Patient.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private Date dateNaissance;

/*
    @OneToMany(mappedBy = "patient")
    List<Document> documents;
*/


}