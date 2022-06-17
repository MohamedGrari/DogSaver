package com.pfa.happydog.service;

import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Traitement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TraitementService {
    Optional<Traitement> findById(Long id);
    List<Traitement> findByFicheMedicale(FicheMedicale ficheMedicale);
    List<Traitement> findAll();
    Page<Traitement> findAll(Pageable pageable);
    void delete(Traitement chien);
    void save(Traitement chien);
}
