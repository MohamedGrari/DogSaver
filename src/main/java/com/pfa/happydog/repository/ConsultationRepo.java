package com.pfa.happydog.repository;

import com.pfa.happydog.model.Consultation;
import com.pfa.happydog.model.FicheMedicale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ConsultationRepo extends JpaRepository<Consultation, Long> {
    List<Consultation> findByDate(LocalDate date);
}
