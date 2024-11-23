package com.example.Pam_web_api.restControllers;


import com.example.Pam_web_api.entities.Patient;
import com.example.Pam_web_api.services.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Patients Controller") // Nom du contrôleur dans Swagger
@RestController
@RequestMapping("/patients")
public class PatientRestController {

    private final PatientService patientService;
    public PatientRestController(PatientService patientService) {
        this.patientService = patientService;
    }


    @ApiOperation(value = "Récupère tous les patients") // Description de l'endpoint
    @GetMapping
    public ResponseEntity<List<Patient>> listPatient(){
        return  new ResponseEntity<>(this.patientService.getAllPatients(), HttpStatus.OK);
    }


    @ApiOperation(value = "Récupère patient par id") // Description de l'endpoint
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@ApiParam(value = "fonction pour recuperer un patient") @PathVariable("id") Long id){
        return patientService.getPatientById(id)
                .map(patient -> ResponseEntity.ok(patient))
                .orElseGet(()-> ResponseEntity.notFound().build());
    }
/*

    @ApiOperation("Ajouter patient") // Description de l'endpoint
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient/form"; // Vue Thymeleaf pour le formulaire d'ajout/modification
    }


    @ApiOperation("Suprimer patient") // Description de l'endpoint
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") Long id) {
        patientService.deletePatient(id);
        return "redirect:/patients";
    }


    @ApiOperation("Modifier patient par id") // Description de l'endpoint
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("patient", patientService.getPatientById(id));
        return "patient/form";
    }


//    @GetMapping
//    public String listPatients(Model model) {
//        List<Patient> patients = patientService.getAllPatients();
//        if (patients == null || patients.isEmpty()) {
//            System.out.println("No patients found");
//        }
//        model.addAttribute("patients", patients) ;
//        return "patient/list"; // Vue Thymeleaf pour lister les patients
//    }


    @PostMapping("/save")
    public String savePatient(@ModelAttribute("patient") Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }
    
 */
}
