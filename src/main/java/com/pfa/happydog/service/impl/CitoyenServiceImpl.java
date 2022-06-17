package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Citoyen;
import com.pfa.happydog.repository.CitoyenRepo;
import com.pfa.happydog.service.CitoyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitoyenServiceImpl implements CitoyenService {
    CitoyenRepo repository;
    @Autowired

    public CitoyenServiceImpl(CitoyenRepo repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Citoyen> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Citoyen> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Citoyen> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Citoyen citoyen) {
        repository.delete(citoyen);
    }

    @Override
    public Citoyen save(Citoyen citoyen) {
        return repository.save(citoyen);
    }
}
