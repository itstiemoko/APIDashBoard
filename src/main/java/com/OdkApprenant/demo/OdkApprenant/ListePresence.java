package com.OdkApprenant.demo.OdkApprenant;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class ListePresence
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listePresenceId;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime heure_arrive_apprenant;

    @Column(nullable = false)
    private LocalTime heure_depart_apprenant;

    @ManyToMany(mappedBy = "listePresences")
    private List<Apprenant> apprenants;

    @ManyToMany(mappedBy = "listePresences")
    private List<Formateur> formateurs;

    //Default constructor
    public ListePresence(){}

    //Constructor
    public ListePresence(LocalDate date, LocalTime heure_arrive_apprenant, LocalTime heure_depart_apprenant, List<Apprenant> apprenants, List<Formateur> formateurs)
    {
        this.date = date;
        this.heure_arrive_apprenant = heure_arrive_apprenant;
        this.heure_depart_apprenant = heure_depart_apprenant;
        this.apprenants = apprenants;
        this.formateurs = formateurs;
    }

    public Integer getListePresenceId() {
        return listePresenceId;
    }

    public void setListePresenceId(Integer listePresenceId) {
        this.listePresenceId = listePresenceId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure_arrive_apprenant() {
        return heure_arrive_apprenant;
    }

    public void setHeure_arrive_apprenant(LocalTime heure_arrive_apprenant) {
        this.heure_arrive_apprenant = heure_arrive_apprenant;
    }

    public LocalTime getHeure_depart_apprenant() {
        return heure_depart_apprenant;
    }

    public void setHeure_depart_apprenant(LocalTime heure_depart_apprenant) {
        this.heure_depart_apprenant = heure_depart_apprenant;
    }

    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public List<Formateur> getFormateurs() {
        return formateurs;
    }

    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
    }
}
