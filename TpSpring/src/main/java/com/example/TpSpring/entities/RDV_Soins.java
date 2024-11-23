package com.example.TpSpring.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "rdv-soins")
// hadi li lte7t kandirouha f ga3 les class li fihoum des relation bidirectionelle bach mayw9a3ch mochkol f loopage
@JsonIdentityInfo(
        scope = RDV_Soins.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class RDV_Soins {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idFacture")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "idRendezVous")
    private Rendez_vous rendez_vous;

    @ManyToOne
    @JoinColumn(name = "idSoin")
    private Soin soin;

    @ManyToOne
    @JoinColumn(name = "idDent")
    private Dent dent;




}
