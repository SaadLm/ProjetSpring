package com.example.Pam_web_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "dentistes")
@Getter
@Setter
public class Dentiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private Date dateNaissance;






//    // hadi fach katkoun l relation f diagramme de class 1 1 fihoum bjouj
//    @OneToOne
//    @JoinColumn(name = "salleId")
//    private Salle salle;
//





}
