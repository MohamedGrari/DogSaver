package com.pfa.happydog.controller;

import com.pfa.happydog.model.Citoyen;
import com.pfa.happydog.service.CitoyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class CitoyenController {
    private CitoyenService service;
    @Autowired
    public CitoyenController(CitoyenService service) {
        this.service = service;
    }
    @GetMapping("citoyens")
    public List<Citoyen> getCitoyen(){
        return service.findAll();
    }
    @GetMapping("citoyen/{id}")
    public Optional<Citoyen> getCitoyenById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @DeleteMapping("citoyen")
    public void deleteCitoyen(@RequestBody Citoyen citoyen){
        service.delete(citoyen);
    }
    @PostMapping("citoyen")
    public Citoyen saveChien (@RequestBody Citoyen citoyen){
        return service.save(citoyen);
    }
}
