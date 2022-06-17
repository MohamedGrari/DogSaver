package com.pfa.happydog.service;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.Consultation;
import com.pfa.happydog.model.FicheMedicale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ConsultationService {
    List<Consultation> findByDate(LocalDate date);
    Optional<Consultation> findById(Long id);
    List<Consultation> findAll();
    Page<Consultation> findAll(Pageable pageable);
    void delete(Consultation consultation);
    Consultation save(Consultation consultation);
}
