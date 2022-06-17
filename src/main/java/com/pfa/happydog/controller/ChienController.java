package com.pfa.happydog.controller;

import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.Staff;
import com.pfa.happydog.service.ChienService;
import com.pfa.happydog.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ChienController {
    private ChienService service;
    @Autowired
    public ChienController(ChienService service) {
        this.service = service;
    }
    @GetMapping("chiens")
    public List<Chien> getChien(){
        return service.findAll();
    }
    @GetMapping("chien/code/{code}")
    public Chien getChienByCode(@PathVariable("code") Long code){
        return service.findChienByCode(code);
    }
    @GetMapping("chien/alias/{alias}")
    public Chien getChienByCode(@PathVariable("alias") String alias){
        return service.findChienByAlias(alias);
    }
    @GetMapping("chien/count/true")
    public int countByArchiveTrue(){
        return service.countByArchiveTrue();
    }
    @GetMapping("chien/count/false")
    public int countByArchiveFalse(){
        return service.countByArchiveFalse();
    }
    @GetMapping("chien/archive/true")
    public List<Chien> getChienByArchiveTrue(){
        return service.findChienByArchiveTrue();
    }
    @GetMapping("chiens/archive/false")
    public List<Chien> getChienByArchiveFalse(){
        return service.findChienByArchiveFalse();
    }
    @DeleteMapping("chien")
    public void deleteChien(@RequestBody Chien chien){
        service.delete(chien);
    }
    @PostMapping("chien")
    public Chien saveChien (@RequestBody Chien chien){
        return service.save(chien);
    }
}
