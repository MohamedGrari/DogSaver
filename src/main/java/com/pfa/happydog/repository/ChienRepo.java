package com.pfa.happydog.repository;

import com.pfa.happydog.model.Chien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository

public interface ChienRepo extends JpaRepository<Chien, Long> {
    List<Chien> findChienByArchiveTrue();
    List<Chien> findChienByArchiveFalse();
    Chien findChienByAlias(String alias);
    Chien findChienByCode(Long code);
    int countByArchiveFalse();
    int countByArchiveTrue();
    List<Chien> findAll();
    Page<Chien> findAll(Pageable pageable);
    void delete(Chien chien);
    }