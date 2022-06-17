package com.pfa.happydog.repository;

import com.pfa.happydog.model.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamationRepo extends JpaRepository<Reclamation, Long> {
    List<Reclamation> findByEtat (String etat);
}
