package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.repository.ChienRepo;
import com.pfa.happydog.service.ChienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChienServiceImpl implements ChienService {
    ChienRepo repository;
    @Autowired
    public ChienServiceImpl(ChienRepo repository) {
        this.repository = repository;
    }
    @Override
    public Chien findChienByCode(Long code) {
        return repository.findChienByCode(code);
    }

    @Override
    public Chien findChienByAlias(String alias) {
        return repository.findChienByAlias(alias);
    }

    @Override
    public int countByArchiveTrue() {
        return repository.countByArchiveTrue();

    }

    @Override
    public int countByArchiveFalse() {
        return repository.countByArchiveFalse();
    }

    @Override
    public List<Chien> findChienByArchiveTrue() {
        return repository.findChienByArchiveTrue();
    }

    @Override
    public List<Chien> findChienByArchiveFalse() {
        return repository.findChienByArchiveFalse();
    }

    @Override
    public List<Chien> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Chien> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Chien chien) {
        repository.delete(chien);
    }

    @Override
    public Chien save(Chien chien) {
        return repository.save(chien);
    }
}
