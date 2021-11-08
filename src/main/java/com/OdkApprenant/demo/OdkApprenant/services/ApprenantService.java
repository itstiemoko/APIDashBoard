package com.OdkApprenant.demo.OdkApprenant.services;

import com.OdkApprenant.demo.OdkApprenant.Apprenant;

import java.util.List;

public interface ApprenantService
{
    /*__________________Cet interface contient toutes les fonctionnalités pour les apprenants______________*/
    public abstract List listApprenant();
    public abstract String addApprenant(Apprenant apprenant);
    public abstract String deleteApprenant(Integer apprenantId);
    public abstract void modifierApprenant(Integer apprenantId, Apprenant apprenant);
    public abstract Apprenant getInfoApprenantById(Integer apprenantId);
    public abstract Apprenant verifyLoginAndPassword(String apprenantLogin, String apprenantPassword);
}
