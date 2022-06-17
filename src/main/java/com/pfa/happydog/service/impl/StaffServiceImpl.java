package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Staff;
import com.pfa.happydog.repository.StaffRepo;
import com.pfa.happydog.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepo repository;
    /*public StaffServiceImpl(StaffRepo repository) {
        this.repository = repository;
    }
*/
    @Override
    public Staff findByCin(String cin) {
        return repository.findByCin(cin);
    }

    @Override
    public List<Staff> findByPrenomOrNom(String prenom) {
        return repository.findStaffByNomContainingIgnoreCaseOrPrenomContainingIgnoreCaseAndActiveTrue(prenom,prenom);
    }

    @Override
    public List<Staff> findByRole(String role) {
        return repository.findByRoleAndActiveTrue(role);
    }

    @Override
    public Page<Staff> findByRole(String role, Pageable pageable){
        return repository.findByRole(role, pageable);
    }

    @Override
    public List<Staff> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Staff staff) {
        repository.delete(staff);
    }

    @Override
    public Staff save(Staff staff) {
        return repository.save(staff);
    }
}
