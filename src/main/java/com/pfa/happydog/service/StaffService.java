package com.pfa.happydog.service;

import com.pfa.happydog.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StaffService {
    Staff findByCin(String cin);
    List<Staff> findByPrenomOrNom(String prenom);
    List<Staff> findByRole(String role);
    Page<Staff> findByRole(String role, Pageable pageable);
    List<Staff> findAll();
    Page<Staff> findAll(Pageable pageable);
    void delete(Staff staff);
    Staff save(Staff staff);
}
