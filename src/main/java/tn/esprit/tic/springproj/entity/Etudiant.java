package tn.esprit.tic.springproj.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Etudiant")
public class Etudiant  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long con;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
}
