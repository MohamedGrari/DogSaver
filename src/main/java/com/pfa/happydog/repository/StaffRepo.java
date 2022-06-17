package com.pfa.happydog.repository;

import com.pfa.happydog.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Long> {
    Staff findByCin(String cin);
    List<Staff> findStaffByNomContainingIgnoreCaseOrPrenomContainingIgnoreCaseAndActiveTrue(String nom, String prenom);
    List<Staff> findByRoleAndActiveTrue(String role);
    Page<Staff> findByRole(String role, Pageable pageable);
}
