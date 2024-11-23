package com.example.Pam_web_api.restControllers;


import com.example.Pam_web_api.entities.Dentiste;

import com.example.Pam_web_api.services.DentisteService;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Nom du contrôleur dans Swagger
@RestController
@RequestMapping("/dentistes")
public class DentisteRestController {


    public final DentisteService dentisteService ;

    public DentisteRestController(DentisteService dentisteService){this.dentisteService = dentisteService;}


    @GetMapping
    public ResponseEntity<List<Dentiste>> listDentiste(){
        return  new ResponseEntity<>(this.dentisteService.getAllDentistes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentiste> getDentiste(@PathVariable("id") Long id){
        return dentisteService.getDentisteById(id)
                .map(dentiste -> ResponseEntity.ok(dentiste))
                .orElseGet(()-> ResponseEntity.notFound().build());
    }




    // Create a new Dentiste (REST API)
    @PostMapping
    public ResponseEntity<Dentiste> createDentiste(@RequestBody Dentiste dentiste) {
        Dentiste createdDentiste = dentisteService.saveDentiste(dentiste);
        return new ResponseEntity<>(createdDentiste, HttpStatus.CREATED);
    }

    // Update an existing Dentiste (REST API)
//    @PutMapping("/{id}")
//    public ResponseEntity<Dentiste> updateDentiste(@PathVariable("id") Long id, @RequestBody Dentiste updatedDentiste) {
//        return dentisteService.updateDentiste(id, updatedDentiste)
//                .map(dentiste -> ResponseEntity.ok(dentiste))
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }

    // Delete a Dentiste by ID (REST API)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDentiste(@PathVariable("id") Long id) {
        boolean deleted = dentisteService.deleteDentiste(id);
        if (deleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
