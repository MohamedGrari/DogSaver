package com.pfa.happydog.service;

import com.pfa.happydog.model.Citoyen;
import com.pfa.happydog.model.Consultation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CitoyenService {
    Optional<Citoyen> findById(Long id);
    List<Citoyen> findAll();
    Page<Citoyen> findAll(Pageable pageable);
    void delete(Citoyen citoyen);
    Citoyen save(Citoyen citoyen);
}
