package tn.esprit.tic.springproj.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")

    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

}

