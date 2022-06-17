package com.pfa.happydog.controller;

import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.model.Traitement;
import com.pfa.happydog.service.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class TraitementController {
    private final TraitementService service;
    @Autowired
    public TraitementController(TraitementService service) {
        this.service = service;
    }
    @GetMapping("traitements")
    public List<Traitement> getTraitement(){
        return service.findAll();
    }
    @GetMapping("traitement/id/{id}")
    public Optional<Traitement> getTraitementById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("traitement/fichemedicale/{fichemedicale}")
    public List<Traitement> getTraitementByFicheMedicale(@PathVariable("fichemedicale") FicheMedicale ficheMedicale){
        return service.findByFicheMedicale(ficheMedicale);
    }
    @DeleteMapping("traitement")
    public void deleteReclamation(@RequestBody Traitement traitement){
        service.delete(traitement);
    }
    @PostMapping("traitement")
    public void saveReclamation (@RequestBody Traitement traitement) {
        service.save(traitement);
    }
}
