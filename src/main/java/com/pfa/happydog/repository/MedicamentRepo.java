package com.pfa.happydog.repository;
import com.pfa.happydog.model.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicamentRepo extends JpaRepository<Medicament, Long> {
    Optional<Medicament> findByLabel(String label);
}
