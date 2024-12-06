package com.example.Resources.restControllers;


import com.example.Resources.entities.Salle;
import com.example.Resources.services.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/ressource/salle")
public class SalleController {

    private final SalleService salleService;
    @Autowired
    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }


    @PostMapping("/")
    public  ResponseEntity<Salle> createSalle(@RequestBody Salle salle) {
        salleService.create(salle);
        return new ResponseEntity<>(salle, HttpStatus.CREATED);
    }
}

