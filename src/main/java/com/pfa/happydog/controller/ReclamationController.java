package com.pfa.happydog.controller;

import com.pfa.happydog.model.Reclamation;
import com.pfa.happydog.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class ReclamationController {
    private final ReclamationService service;
    @Autowired
    public ReclamationController(ReclamationService service) {
        this.service = service;
    }
    @GetMapping("reclamations")
    public List<Reclamation> getReclamation(){
        return service.findAll();
    }
    @GetMapping("reclamation/id/{id}")
    public Optional<Reclamation> getReclamationById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("reclamation/etat/{etat}")
    public List<Reclamation> getReclamationByEtat(@PathVariable("etat") String etat){
        return service.findByEtat(etat);
    }
    @DeleteMapping("reclamation")
    public void deleteReclamation(@RequestBody Reclamation reclamation){
        service.delete(reclamation);
    }
    @PostMapping("reclamation")
    public void saveReclamation (@RequestBody Reclamation reclamation){
        service.save(reclamation);
    }
}
