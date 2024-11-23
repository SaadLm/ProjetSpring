package com.example.Pam_web_api.services;


import com.example.Pam_web_api.entities.Dentiste;
import com.example.Pam_web_api.repositories.DentisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DentisteService {
    @Autowired
    private DentisteRepository dentisteRepository;
    // Méthode pour créer un dentiste
    public Dentiste saveDentiste(Dentiste dentiste) {
        return dentisteRepository.save(dentiste);
    }
    // Méthode pour récupérer un dentiste par son ID
    public Optional<Dentiste> getDentisteById(Long id) {
        return dentisteRepository.findById(id);
    }
    // Méthode pour récupérer tous les dentistes
    public List<Dentiste> getAllDentistes() {
        return dentisteRepository.findAll();
    }
    // Méthode pour mettre à jour un dentiste
    public Dentiste updateDentiste(Long id, Dentiste updatedDentiste) {
        // Find the existing Dentiste by ID
        Optional<Dentiste> existingDentisteOpt = dentisteRepository.findById(id);

        // Check if the Dentiste exists
        if (existingDentisteOpt.isPresent()) {
            Dentiste existingDentiste = existingDentisteOpt.get();

            // Update fields from the updatedDentiste object
            existingDentiste.setNom(updatedDentiste.getNom());
            existingDentiste.setPrenom(updatedDentiste.getPrenom());
            existingDentiste.setDateNaissance(updatedDentiste.getDateNaissance());
            // other fields to be updated

            // Save and return the updated Dentiste
            return dentisteRepository.save(existingDentiste);
        } else {
            // Throw an exception if no Dentiste with the given ID was found
            throw new RuntimeException("Dentiste introuvable avec l'id : " + id);
        }
    }

    // Méthode pour supprimer un dentiste
    public boolean deleteDentiste(Long id) {
        Optional<Dentiste> existingDentiste = dentisteRepository.findById(id);
        if (existingDentiste.isPresent()) {
            dentisteRepository.delete(existingDentiste.get());
            return true;  // Deletion successful
        } else {
            return false;  // Dentiste not found
        }
    }


}

