package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Medicament;
import com.pfa.happydog.repository.MedicamentRepo;
import com.pfa.happydog.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MedicamentServiceImpl implements MedicamentService {
    MedicamentRepo repository;
    @Autowired
    public MedicamentServiceImpl(MedicamentRepo repository) {
        this.repository= repository;
    }

    @Override
    public Optional<Medicament> findByLabel(String label) {
        return repository.findByLabel(label);
    }

    @Override
    public Optional<Medicament> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Medicament> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Medicament> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Medicament medicament) {
        repository.delete(medicament);
    }

    @Override
    public void save(Medicament medicament) {
        repository.save(medicament);
    }
}
