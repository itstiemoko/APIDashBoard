package com.OdkApprenant.demo.OdkApprenant.controllers;

import com.OdkApprenant.demo.OdkApprenant.Formateur;
import com.OdkApprenant.demo.OdkApprenant.services.FormateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api")
public class FormateurController
{
    @Autowired
    FormateurServiceImp formateurServiceImp;

    @GetMapping("/getAllFormateurs")
    public List<Formateur> getAllFormateurs()
    {
        return this.formateurServiceImp.getAllFormateurs();
    }

    @GetMapping("/getFormateurById/{id}")
    public Formateur getFormateurById(@PathVariable("id") Integer formateurId)
    {
        return this.formateurServiceImp.getFormateurById(formateurId);
    }

    @PostMapping("/addFormateur")
    public String addFormateur(@RequestBody Formateur formateur)
    {
        return this.formateurServiceImp.addFormateur(formateur);
    }

    @DeleteMapping("/deleteFormateur/{id}")
    public String deleteFormateur(@PathVariable("id") Integer formateurId)
    {
        return this.formateurServiceImp.deleteFormateur(formateurId);
    }

    @PutMapping("/modifyFormateur/{id}")
    public String modifyFormateur(@RequestBody Formateur formateur, @PathVariable("id") Integer formateurId)
    {
        this.formateurServiceImp.modifyFormateur(formateur, formateurId);
        return "Formateur "+formateur.getFormateurPrenom()+" "+formateur.getFormateurNom()+" modifié avec succès";
    }
}
