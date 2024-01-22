package tn.esprit.tic.springproj.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Universite")

public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")

    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;

}
