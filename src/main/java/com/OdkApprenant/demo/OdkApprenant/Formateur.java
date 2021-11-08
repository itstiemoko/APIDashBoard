package com.OdkApprenant.demo.OdkApprenant;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//Class formateur
@Entity
public class Formateur
{
    //Déclaration des attributs du formateur
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer formateurId;

    @Column(nullable = false, length = 20)
    private String formateurNom;

    @Column(nullable = false, length = 20)
    private String formateurPrenom;

    @Column(nullable = false, length = 5)
    private String formateurAge;

    @Column(nullable = false, length = 10)
    private String formateurGenre;

    @Column(nullable = false, length = 30, unique = true)
    private String formateurEmail;

    @Column(nullable = false, length = 15)
    private String formateurTelephone;

    @Column(nullable = false)
    private LocalDate dateCreation= LocalDate.now();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "presenceFormateur",
            joinColumns = @JoinColumn(name = "id_formateur"),
            inverseJoinColumns = @JoinColumn(name = "id_presence")
    )
    private List<ListePresence> listePresences;

    public List<ListePresence> getListePresences() {
        return listePresences;
    }

    public void setListePresences(List<ListePresence> listePresences) {
        this.listePresences = listePresences;
    }

    /*__________________________________Déclaration des constructeurs_______________________________________*/
    //Default constructeur
    public Formateur(){}

    //Constructeur avec paramètre
    public Formateur(String formateurNom, String formateurPrenom, String formateurAge, String formateurGenre, String formateurEmail, String formateurTelephone, LocalDate dateCreation)
    {
        this.formateurNom = formateurNom;
        this.formateurPrenom = formateurPrenom;
        this.formateurAge = formateurAge;
        this.formateurGenre = formateurGenre;
        this.formateurEmail = formateurEmail;
        this.formateurTelephone = formateurTelephone;
        this.dateCreation = dateCreation;
    }

    /*__________________________Getters and Setters___________________________________*/

    public Integer getFormateurId() {
        return formateurId;
    }

    public void setFormateurId(Integer formateurId) {
        this.formateurId = formateurId;
    }

    public String getFormateurNom() {
        return formateurNom;
    }

    public void setFormateurNom(String formateurNom) {
        this.formateurNom = formateurNom;
    }

    public String getFormateurPrenom() {
        return formateurPrenom;
    }

    public void setFormateurPrenom(String formateurPrenom) {
        this.formateurPrenom = formateurPrenom;
    }

    public String getFormateurAge() {
        return formateurAge;
    }

    public void setFormateurAge(String formateurAge) {
        this.formateurAge = formateurAge;
    }

    public String getFormateurGenre() {
        return formateurGenre;
    }

    public void setFormateurGenre(String formateurGenre) {
        this.formateurGenre = formateurGenre;
    }

    public String getFormateurEmail() {
        return formateurEmail;
    }

    public void setFormateurEmail(String formateurEmail) {
        this.formateurEmail = formateurEmail;
    }

    public String getFormateurTelephone() {
        return formateurTelephone;
    }

    public void setFormateurTelephone(String formateurTelephone) {
        this.formateurTelephone = formateurTelephone;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
}
