package com.pfa.happydog.repository;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.FicheMedicale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FicheMedicaleRepo extends JpaRepository<FicheMedicale, Long> {
    Optional<FicheMedicale> findByEtat(String etat);
    Optional<FicheMedicale> findByChien(Chien chien);
}
