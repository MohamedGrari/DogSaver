package com.pfa.happydog.repository;

import com.pfa.happydog.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface OperationRepo extends JpaRepository<Operation, Long> {
    List<Operation> findByDate (LocalDate date);
}
