package com.pfa.happydog.service;

import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Reclamation;
import com.pfa.happydog.model.Traitement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ReclamationService {
    Optional<Reclamation> findById (Long id);
    List<Reclamation> findByEtat(String etat);
    List<Reclamation> findAll();
    Page<Reclamation> findAll(Pageable pageable);
    void delete(Reclamation reclamation);
    void save(Reclamation reclamation);
}
