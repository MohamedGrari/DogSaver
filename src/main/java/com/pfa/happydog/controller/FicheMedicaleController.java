package com.pfa.happydog.controller;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.service.FicheMedicaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class FicheMedicaleController {
    private FicheMedicaleService service;
    @Autowired
    public FicheMedicaleController(FicheMedicaleService service) {
        this.service = service;
    }
    @GetMapping("fichemedicales")
    public List<FicheMedicale> getStaff(){
        return service.findAll();
    }
    @GetMapping("staff/etat/{etat}")
    public Optional<FicheMedicale> getFicheMedicaleByEtat(@PathVariable("etat") String etat){
        return service.findByEtat(etat);
    }
    @GetMapping("staffs/id/{id}")
    public Optional<FicheMedicale> getStaffByPrenomOrNom(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("staffs/chien/{chien}")
    public Optional<FicheMedicale> getStaffByRole(@PathVariable("chien") Chien chien){
        return service.findByChien(chien);
    }
    @DeleteMapping("fichemedicale")
    public void deleteStaff(@RequestBody FicheMedicale ficheMedicale){
        service.delete(ficheMedicale);
    }
    @PostMapping("fichemedicale")
    public void saveStaff (@RequestBody FicheMedicale ficheMedicale){
         service.save(ficheMedicale);
    }
}
