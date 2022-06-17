package com.pfa.happydog.controller;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.Citoyen;
import com.pfa.happydog.model.Consultation;
import com.pfa.happydog.service.ChienService;
import com.pfa.happydog.service.ConsultationService;
import com.pfa.happydog.service.impl.ConsultationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class ConsultationController {
    private ConsultationService service;
    @Autowired
    public ConsultationController(ConsultationService service) {
        this.service = service;
    }
    @GetMapping("consultations")
    public List<Consultation> getConsultation(){
        return service.findAll();
    }
    @GetMapping("consultation/id/{id}")
    public Optional<Consultation> getConsultationById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("consultation/date/{date}")
    public List<Consultation> getConsultationByDate(@PathVariable("date") LocalDate date){
        return service.findByDate(date);
    }
    @DeleteMapping("consultation")
    public void deleteChien(@RequestBody Consultation consultation){
        service.delete(consultation);
    }
    @PostMapping("consultation")
    public Consultation saveChien (@RequestBody Consultation consultation){
        return service.save(consultation);
    }
}
