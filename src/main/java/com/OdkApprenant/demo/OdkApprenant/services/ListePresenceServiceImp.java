package com.OdkApprenant.demo.OdkApprenant.services;

import com.OdkApprenant.demo.OdkApprenant.ListePresence;
import com.OdkApprenant.demo.OdkApprenant.repositories.ListePresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListePresenceServiceImp implements ListePresenceService
{
    @Autowired
    ListePresenceRepository listePresenceRepository;

    public List<ListePresence> getAllListePresence()
    {
        return this.listePresenceRepository.findAll();
    }

    public String addListePresence(ListePresence listePresence)
    {
        this.listePresenceRepository.save(listePresence);
        return "Ajout liste de présence réussie avec succès";
    }
}
