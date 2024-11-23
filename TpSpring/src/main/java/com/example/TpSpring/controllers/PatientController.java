package com.example.TpSpring.controllers;


import com.example.TpSpring.entities.Patient;
import com.example.TpSpring.services.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping
    public String listPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        if (patients == null || patients.isEmpty()) {
            System.out.println("No patients found");
        }
        model.addAttribute("patients", patients) ;
        return "patient/list"; // Vue Thymeleaf pour lister les patients
    }
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("patient", new Patient());
//        return "patient/form"; // Vue Thymeleaf pour le formulaire d'ajout/modification
//    }


//    @PostMapping("/save")
//    public String savePatient(@ModelAttribute("patient") Patient patient) {
//        patientService.save(patient);
//        return "redirect:/patients";
//    }
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("patient", patientService.findById(id));
//        return "patient/form";
//    }
//    @GetMapping("/delete/{id}")
//    public String deletePatient(@PathVariable("id") Long id) {
//        patientService.deleteById(id);
//        return "redirect:/patients";
//    }
}
