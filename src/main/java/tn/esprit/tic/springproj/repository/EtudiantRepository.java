package tn.esprit.tic.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.tic.springproj.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
