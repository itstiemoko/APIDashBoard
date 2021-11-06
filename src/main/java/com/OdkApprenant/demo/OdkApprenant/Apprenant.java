package com.OdkApprenant.demo.OdkApprenant;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/*_______________On definit la classe Apprenant avec @Entity qui sera notre table dans la base_____________*/
@Entity
public class Apprenant
{
    /*_______________________On spécifie la clé primaire avec l'option autoincrement__________________________*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer apprenantId;

    /*__________Déclaration des attributs qui seront les colonnes de notre table____________*/
    @Column(nullable = false, length = 25)
    private String apprenantNom;

    @Column(nullable = false, length = 25)
    private String apprenantPrenom;

    @Column(nullable = false, length = 10)
    private String apprenantAge;

    @Column(nullable = false, length = 15)
    private String apprenantTelephone;

    @Column(nullable = false, length = 30, unique = true)
    private String apprenantEmail;

    @Column(nullable = false, length = 10)
    private String apprenantLogin;

    @Column(nullable = false, length = 30)
    private String apprenantPassword;

    @Column(nullable = false, length = 10)
    private String apprenantGenre;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ApprenantStatus apprenantStatus;

    @Column(nullable = false)
    private LocalDate dateCreation = LocalDate.now();

    @Column(nullable = false)
    private LocalDate dateModification;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "presenceApprenant",
            joinColumns = @JoinColumn(name = "id_apprenant"),
            inverseJoinColumns = @JoinColumn(name = "id_presence")
    )
    private List<ListePresence> listePresences;

    public List<ListePresence> getListePresences() {
        return listePresences;
    }

    public void setListePresences(List<ListePresence> listePresences) {
        this.listePresences = listePresences;
    }

    //Le constructeur par defaut
    public Apprenant(){}

    //Le constructeur avec paramètre
    public Apprenant(String apprenantNom, String apprenantPrenom, String apprenantAge, String apprenantTelephone, String apprenantEmail,
                     String apprenantLogin, String apprenantPassword, String apprenantGenre, ApprenantStatus apprenantStatus, LocalDate dateCreation, LocalDate dateModification) {
        this.apprenantNom = apprenantNom;
        this.apprenantPrenom = apprenantPrenom;
        this.apprenantAge = apprenantAge;
        this.apprenantTelephone = apprenantTelephone;
        this.apprenantEmail = apprenantEmail;
        this.apprenantLogin = apprenantLogin;
        this.apprenantPassword = apprenantPassword;
        this.apprenantGenre = apprenantGenre;
        this.apprenantStatus = apprenantStatus;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    /*_______________________Les Getters et les Setters de nos attributs___________________________________*/
    public Integer getApprenantId() {
        return apprenantId;
    }

    public void setApprenantId(Integer apprenantId) {
        this.apprenantId = apprenantId;
    }

    public String getApprenantNom() {
        return apprenantNom;
    }

    public void setApprenantNom(String apprenantNom) {
        this.apprenantNom = apprenantNom;
    }

    public String getApprenantPrenom() {
        return apprenantPrenom;
    }

    public void setApprenantPrenomNom(String apprenantPrenom) {
        this.apprenantPrenom = apprenantPrenom;
    }

    public String getApprenantAge() {
        return apprenantAge;
    }

    public void setApprenantAge(String apprenantAge) {
        this.apprenantAge = apprenantAge;
    }

    public String getApprenantTelephone() {
        return apprenantTelephone;
    }

    public void setApprenantTelephone(String apprenantTelephone) {
        this.apprenantTelephone = apprenantTelephone;
    }

    public String getApprenantEmail() {
        return apprenantEmail;
    }

    public void setApprenantEmail(String apprenantEmail) {
        this.apprenantEmail = apprenantEmail;
    }

    public String getApprenantLogin() {
        return apprenantLogin;
    }

    public void setApprenantLogin(String apprenantLogin) {
        this.apprenantLogin = apprenantLogin;
    }

    public String getApprenantPassword() {
        return apprenantPassword;
    }

    public void setApprenantPassword(String apprenantPassword) {
        this.apprenantPassword = apprenantPassword;
    }

    public String getApprenantGenre() {
        return apprenantGenre;
    }

    public void setApprenantGenre(String apprenantGenre) {
        this.apprenantGenre = apprenantGenre;
    }

    public ApprenantStatus getApprenantStatus() {
        return apprenantStatus;
    }

    public void setApprenantStatus(ApprenantStatus apprenantStatus) {
        this.apprenantStatus = apprenantStatus;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateModification() {
        return dateModification;
    }

    public void setDateModification(LocalDate dateModification) {
        this.dateModification = dateModification;
    }
}
