package com.pfa.happydog.service;

import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Operation;
import com.pfa.happydog.model.Traitement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OperationService {
    List<Operation> findByDate (LocalDate date);
    Optional<Operation> findById(Long id);
    List<Operation> findAll();
    Page<Operation> findAll(Pageable pageable);
    void delete(Operation operation);
    void save(Operation operation);
}
