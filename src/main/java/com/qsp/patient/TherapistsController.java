package com.qsp.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TherapistsController {

    @Autowired
    private TherapistsDAO dao;

    @PostMapping("/th")
    public Therapists saveTherapists(@RequestBody Therapists Therapists) {
        return dao.saveTherapists(Therapists);
    }

    @PutMapping("/th")
    public Therapists updateTherapists(@RequestBody Therapists Therapists) {
        return dao.updateTherapists(Therapists);
    }

    @GetMapping("/th/{id}")
    public Therapists findTherapistsById(@PathVariable Integer id) {
        return dao.findTherapistsById(id);
    }

    @DeleteMapping("/th/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        Therapists Therapists = dao.findTherapistsById(id);
        if (Therapists != null) {
            dao.deleteTherapistsById(id);
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Given ID is not present");
        }
    }

    @GetMapping("/th")
    public List<Therapists> findAll() {
        return dao.findAllTherapists();
    }
}
