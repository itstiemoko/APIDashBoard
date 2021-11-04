package com.OdkApprenant.demo.OdkApprenant;

import javax.persistence.*;

@Entity
public class Admin
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;

    @Column(nullable = false, length = 30)
    private String adminNom;

    @Column(nullable = false, length = 30)
    private String adminPrenom;

    @Column(nullable = false, length = 30)
    private String adminEmail;

    @Column(nullable = false, length = 30)
    private String adminPassword;

    //Default constructor
    public Admin(){}

    //Constructor with params

    public Admin(String adminNom, String adminPrenom, String adminEmail, String adminPassword)
    {
        this.adminNom = adminNom;
        this.adminPrenom = adminPrenom;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }

    /*_____________________Getters and Setters___________________*/

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminNom() {
        return adminNom;
    }

    public void setAdminNom(String adminNom) {
        this.adminNom = adminNom;
    }

    public String getAdminPrenom() {
        return adminPrenom;
    }

    public void setAdminPrenom(String adminPrenom) {
        this.adminPrenom = adminPrenom;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
