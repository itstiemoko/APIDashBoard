package com.OdkApprenant.demo.OdkApprenant.services;

import com.OdkApprenant.demo.OdkApprenant.Formateur;

import java.util.List;

public interface FormateurService
{
    List<Formateur> getAllFormateurs();
    String addFormateur(Formateur formateur);
    String deleteFormateur(Integer formateurId);
    void modifyFormateur(Formateur formateur, Integer formateurId);
    Formateur getFormateurById(Integer formateurId);
}
