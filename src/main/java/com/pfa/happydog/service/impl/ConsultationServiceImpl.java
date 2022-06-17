package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Consultation;
import com.pfa.happydog.repository.ConsultationRepo;
import com.pfa.happydog.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultationServiceImpl implements ConsultationService {
    ConsultationRepo repository;
    @Autowired
    public ConsultationServiceImpl(ConsultationRepo repository) {
        this.repository = repository;
    }

    @Override
    public List<Consultation> findByDate(LocalDate date) {
        return repository.findByDate(date);
    }

    @Override
    public Optional<Consultation> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Consultation> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Consultation> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Consultation consultation) {
        repository.delete(consultation);
    }

    @Override
    public Consultation save(Consultation consultation) {
        repository.save(consultation);
        return consultation;
    }
}
