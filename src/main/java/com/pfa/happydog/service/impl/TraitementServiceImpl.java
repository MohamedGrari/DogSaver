package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Traitement;
import com.pfa.happydog.repository.TraitementRepo;
import com.pfa.happydog.service.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraitementServiceImpl implements TraitementService {
    TraitementRepo repository;
    @Autowired
    public TraitementServiceImpl(TraitementRepo repository) {
        this.repository= repository;
    }

    @Override
    public Optional<Traitement> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Traitement> findByFicheMedicale(FicheMedicale ficheMedicale) {
        return repository.findByFicheMedicale(ficheMedicale);
    }

    @Override
    public List<Traitement> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Traitement> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Traitement chien) {
        repository.delete(chien);
    }

    @Override
    public void save(Traitement chien) {

    }
}
