package com.pfa.happydog.controller;

import com.pfa.happydog.model.Medicament;
import com.pfa.happydog.model.Staff;
import com.pfa.happydog.service.MedicamentService;
import com.pfa.happydog.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class MedicamentController {
    private final MedicamentService service;
    @Autowired
    public MedicamentController(MedicamentService service) {
        this.service = service;
    }
    @GetMapping("medicaments")
    public List<Medicament> getMedicament(){
        return service.findAll();
    }
    @GetMapping("medicament/id/{id}")
    public Optional<Medicament> getMedicamentById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("medicament/label/{label}")
    public Optional<Medicament> getMedicamentByLabel(@PathVariable("label") String label){
        return service.findByLabel(label);
    }
    @DeleteMapping("medicament")
    public void deleteStaff(@RequestBody Medicament medicament){
        service.delete(medicament);
    }
    @PostMapping("medicament")
    public void saveStaff (@RequestBody Medicament medicament){
         service.save(medicament);
    }
}
