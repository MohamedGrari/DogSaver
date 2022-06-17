package com.pfa.happydog.controller;

import com.pfa.happydog.model.Staff;
import com.pfa.happydog.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StaffController {
    private final StaffService service;
    @Autowired
    public StaffController(StaffService service) {
        this.service = service;
    }
    @GetMapping("staffs")
    public List<Staff> getStaff(){
        return service.findAll();
    }
    @GetMapping("staff/cin/{cin}")
    public Staff getStaffByCin(@PathVariable("cin") String cin){
        return service.findByCin(cin);
    }
    @GetMapping("staffs/prenom/{prenom}")
    public List<Staff> getStaffByPrenomOrNom(@PathVariable("prenom") String prenom){
        return service.findByPrenomOrNom(prenom);
    }
    @GetMapping("staffs/role/{role}")
    public List<Staff> getStaffByRole(@PathVariable("role") String role){
        return service.findByRole(role);
    }
    @DeleteMapping("staff")
    public void deleteStaff(@RequestBody Staff staff){
        service.delete(staff);
    }
    @PostMapping("staff")
    public Staff saveStaff (@RequestBody Staff staff){
        return service.save(staff);
    }
}
