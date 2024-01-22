package tn.esprit.tic.springproj.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name = "idReservation")
    private String idReservation;
    private Boolean estValide;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;
}