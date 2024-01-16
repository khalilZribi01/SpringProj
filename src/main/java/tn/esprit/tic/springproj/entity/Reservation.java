package tn.esprit.tic.springproj.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation")
    private String idReservation;
    private Boolean estValide;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

}