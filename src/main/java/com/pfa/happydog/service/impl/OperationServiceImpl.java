package com.pfa.happydog.service.impl;

import com.pfa.happydog.model.Operation;
import com.pfa.happydog.repository.OperationRepo;
import com.pfa.happydog.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class OperationServiceImpl implements OperationService {

    OperationRepo repository;
    @Autowired
    public OperationServiceImpl(OperationRepo repository) {
        this.repository = repository;
    }

    @Override
    public List<Operation> findByDate(LocalDate date) {
        return repository.findByDate(date);
    }
    @Override
    public Optional<Operation> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Operation> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Operation> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(Operation operation) {
        repository.delete(operation);
    }

    @Override
    public void save(Operation operation) {
        repository.save(operation);
    }
}
