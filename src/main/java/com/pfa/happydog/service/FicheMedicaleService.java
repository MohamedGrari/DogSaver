package com.pfa.happydog.service;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Medicament;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FicheMedicaleService {
    Optional<FicheMedicale> findByEtat(String etat);
    Optional<FicheMedicale> findById(Long id);
    Optional<FicheMedicale> findByChien(Chien chien);
    List<FicheMedicale> findAll();
    Page<FicheMedicale> findAll(Pageable pageable);
    void delete(FicheMedicale ficheMedicale);
    void save(FicheMedicale ficheMedicale);
}
