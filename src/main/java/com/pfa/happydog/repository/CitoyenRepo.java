package com.pfa.happydog.repository;

import com.pfa.happydog.model.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitoyenRepo extends JpaRepository<Citoyen, Long> {
}
