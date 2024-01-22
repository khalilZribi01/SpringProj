package tn.esprit.tic.springproj.services;

import tn.esprit.tic.springproj.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
}
