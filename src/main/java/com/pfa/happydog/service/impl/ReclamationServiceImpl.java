package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Reclamation;
import com.pfa.happydog.repository.ReclamationRepo;
import com.pfa.happydog.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReclamationServiceImpl implements ReclamationService {
    ReclamationRepo repository;
    @Autowired
    public ReclamationServiceImpl(ReclamationRepo repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Reclamation> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Reclamation> findByEtat(String etat) {
        return repository.findByEtat(etat);
    }

    @Override
    public List<Reclamation> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Reclamation> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Reclamation reclamation) {
        repository.delete(reclamation);
    }

    @Override
    public void save(Reclamation reclamation) {
        repository.save(reclamation);
    }
}
