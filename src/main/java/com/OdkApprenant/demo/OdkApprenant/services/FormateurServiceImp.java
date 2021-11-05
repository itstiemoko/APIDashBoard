package com.OdkApprenant.demo.OdkApprenant.services;

import com.OdkApprenant.demo.OdkApprenant.Formateur;
import com.OdkApprenant.demo.OdkApprenant.repositories.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FormateurServiceImp implements FormateurService
{
    //Inject repository
    @Autowired
    FormateurRepository formateurRepository;

    //Get all formateurs
    public List<Formateur> getAllFormateurs()
    {
        return this.formateurRepository.findAll();
    }

    //Add a formateur
    public String addFormateur(Formateur formateur)
    {
        this.formateurRepository.save(formateur);

        return "Formateur "+formateur.getFormateurPrenom()+" "+formateur.getFormateurNom()+" ajouté avec succès!";
    }

    //Delete formateur by Id
    public String deleteFormateur(Integer formateurId)
    {
        this.formateurRepository.deleteById(formateurId);
        return "Formateur avec l'id : "+formateurId+" supprimé avec succès";
    }

    public Formateur getFormateurById(Integer formateurId)
    {
        Optional<Formateur> formateurById = this.formateurRepository.findById(formateurId);

        if(formateurById.isEmpty())
        {
            throw new IllegalStateException("Formateur avec l'id : "+formateurId+" n'existe pas!");
        }

        return formateurById.get();
    }

    //Update formateur
    @Transactional
    public void modifyFormateur(Formateur formateur, Integer formateurId)
    {
        Formateur existingFormateur = this.formateurRepository.getById(formateurId);
        existingFormateur.setFormateurNom(formateur.getFormateurNom());
        existingFormateur.setFormateurPrenom(formateur.getFormateurPrenom());
        existingFormateur.setFormateurAge(formateur.getFormateurAge());
        existingFormateur.setFormateurGenre(formateur.getFormateurGenre());
        existingFormateur.setFormateurEmail(formateur.getFormateurEmail());
        existingFormateur.setFormateurTelephone(formateur.getFormateurTelephone());
    }
}
