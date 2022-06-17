package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.repository.FicheMedicaleRepo;
import com.pfa.happydog.service.FicheMedicaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheMedicaleServiceImpl implements FicheMedicaleService {
    FicheMedicaleRepo repository;
    @Autowired
    public FicheMedicaleServiceImpl(FicheMedicaleRepo repository) {
        this.repository = repository;
    }

    @Override
    public Optional<FicheMedicale> findByEtat(String etat) {
        return repository.findByEtat(etat);
    }

    @Override
    public Optional<FicheMedicale> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<FicheMedicale> findByChien(Chien chien) {
        return repository.findByChien(chien);
    }

    @Override
    public List<FicheMedicale> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<FicheMedicale> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(FicheMedicale ficheMedicale) {
        repository.delete(ficheMedicale);
    }

    @Override
    public void save(FicheMedicale ficheMedicale) {
        repository.save(ficheMedicale);
    }
}
