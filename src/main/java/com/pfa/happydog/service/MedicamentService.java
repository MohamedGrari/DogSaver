package com.pfa.happydog.service;

import com.pfa.happydog.model.Medicament;
import com.pfa.happydog.model.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MedicamentService {
    Optional<Medicament> findByLabel(String label);
    Optional<Medicament> findById(Long id);
    List<Medicament> findAll();
    Page<Medicament> findAll(Pageable pageable);
    void delete(Medicament medicament);
    void save(Medicament medicament);
}
