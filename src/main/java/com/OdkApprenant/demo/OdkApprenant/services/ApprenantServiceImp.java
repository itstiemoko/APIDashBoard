package com.OdkApprenant.demo.OdkApprenant.services;

import com.OdkApprenant.demo.OdkApprenant.Apprenant;
import com.OdkApprenant.demo.OdkApprenant.repositories.ApprenantRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/*________La classe qui implemente les fonctionnalités de notre interface apprenant________*/
@Service
public class ApprenantServiceImp implements ApprenantService
{
    ApprenantRepository apprenantRepository;

    public ApprenantServiceImp(ApprenantRepository apprenantRepository)
    {
        this.apprenantRepository = apprenantRepository;
    }

    /*____________Cette methode nous permet de récupérer tous les apprenants_________________*/
    public List<Apprenant> listApprenant()
    {
        return apprenantRepository.findAll();
    }

    /*____________Cette methode nous permet de récupérer l'apprenant par id_________________*/
    public Apprenant getInfoApprenantById(Integer apprenantId)
    {
        return this.apprenantRepository.findById(apprenantId).get();
    }

    /*____________Cette methode nous permet d'ajouter un apprenant_________________*/
    public String addApprenant(Apprenant apprenant)
    {
        /*____________________On vérifie d'abord si l'email de l'apprenant existe déjà dans la base__________________________*/
        Optional<Apprenant> optionalApprenant = this.apprenantRepository.findApprenantByEmail(apprenant.getApprenantEmail());

        if(optionalApprenant.isPresent())
        {
            throw new IllegalStateException("Email déjà pris !!!");
        }

        /*-----------------Sinon on enregistre l'apprenant-----------------------------*/
        this.apprenantRepository.save(apprenant);
        return "Vous avez ajoutee l'apprenant : "+apprenant.getApprenantNom()+" "+apprenant.getApprenantPrenom();
    }

    /*____________Cette methode nous permet supprimer un apprenant à travers son id_________________*/
    public String deleteApprenant(Integer apprenantId)
    {
        this.apprenantRepository.deleteById(apprenantId);
        return "Vous avez supprimeé l'apprenant dont son id est : "+apprenantId;
    }

    /*____________Cette methode nous permet modifier un apprenant_________________*/
    @Transactional
    public void modifierApprenant(Integer apprenantId, Apprenant apprenant)
    {
        Apprenant existingApprenant = this.apprenantRepository.findById(apprenantId).orElseThrow();

        existingApprenant.setApprenantNom(apprenant.getApprenantNom());
        existingApprenant.setApprenantPrenomNom(apprenant.getApprenantPrenom());
        existingApprenant.setApprenantAge(apprenant.getApprenantAge());
        existingApprenant.setApprenantTelephone(apprenant.getApprenantTelephone());
        existingApprenant.setApprenantEmail(apprenant.getApprenantEmail());
        existingApprenant.setApprenantLogin(apprenant.getApprenantLogin());
        existingApprenant.setApprenantPassword(apprenant.getApprenantPassword());
        existingApprenant.setApprenantGenre(apprenant.getApprenantGenre());
        existingApprenant.setApprenantStatus(apprenant.getApprenantStatus());
        existingApprenant.setDateCreation(apprenant.getDateCreation());
        existingApprenant.setDateModification(apprenant.getDateModification());
    }

    public boolean verifyLoginAndPassword(String apprenantLogin, String apprenantPassword)
    {
        Optional<Apprenant> loginPassword = this.apprenantRepository.verifyLoginPassword(apprenantLogin, apprenantPassword);

        if(loginPassword.isPresent())
        {
            return true;
        }

        return false;
    }
}
