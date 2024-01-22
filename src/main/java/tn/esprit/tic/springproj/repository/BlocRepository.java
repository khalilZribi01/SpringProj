package tn.esprit.tic.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entity.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
