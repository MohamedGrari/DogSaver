package com.pfa.happydog.service;

import com.pfa.happydog.model.Chien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChienService {
    Chien findChienByCode(Long code);
    Chien findChienByAlias(String alias);
    int countByArchiveTrue();
    int countByArchiveFalse();
    List<Chien> findChienByArchiveTrue();
    List<Chien> findChienByArchiveFalse();
    List<Chien> findAll();
    Page<Chien> findAll(Pageable pageable);
    void delete(Chien chien);
    Chien save(Chien chien);
}
