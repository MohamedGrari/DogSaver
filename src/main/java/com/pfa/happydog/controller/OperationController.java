package com.pfa.happydog.controller;

import com.pfa.happydog.model.Medicament;
import com.pfa.happydog.model.Operation;
import com.pfa.happydog.service.MedicamentService;
import com.pfa.happydog.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class OperationController {
    private final OperationService service;
    @Autowired
    public OperationController(OperationService service) {
        this.service = service;
    }
    @GetMapping("operations")
    public List<Operation> getOperation(){
        return service.findAll();
    }
    @GetMapping("operation/id/{id}")
    public Optional<Operation> getById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("operation/date/{date}")
    public List<Operation> getMedicamentByLabel(@PathVariable("date") LocalDate date){
        return service.findByDate(date);
    }
    @DeleteMapping("operation")
    public void deleteOperation(@RequestBody Operation operation){
        service.delete(operation);
    }
    @PostMapping("operation")
    public void saveOperation(@RequestBody Operation operation){
        service.save(operation);
    }
}
