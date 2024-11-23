package com.example.TpSpring.services;

import com.example.TpSpring.entities.Patient;
import com.example.TpSpring.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    // Méthode pour créer un patient
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }
    // Méthode pour récupérer un patient par son ID
    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }
    // Méthode pour récupérer tous les patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    // Méthode pour mettre à jour un patient
    public Patient updatePatient(Long id, Patient updatedPatient) {
        Optional<Patient> existingPatient = patientRepository.findById(id);
        if (existingPatient.isPresent()) {
            Patient patient = existingPatient.get();
            patient.setNom(updatedPatient.getNom());
            patient.setPrenom(updatedPatient.getPrenom());
            patient.setDateNaissance(updatedPatient.getDateNaissance());
// autres champs à mettre à jour
            return patientRepository.save(patient);
        } else {
            throw new RuntimeException("Patient introuvable avec l'id : " + id);
        }
    }
    // Méthode pour supprimer un patient
    public void deletePatient(Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
        } else {
            throw new RuntimeException("Patient introuvable avec l'id : " + id);
        }
    }
}

