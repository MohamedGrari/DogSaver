package com.pfa.happydog.repository;

import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraitementRepo extends JpaRepository<Traitement, Long> {
    List<Traitement> findByFicheMedicale(FicheMedicale ficheMedicale);
}
