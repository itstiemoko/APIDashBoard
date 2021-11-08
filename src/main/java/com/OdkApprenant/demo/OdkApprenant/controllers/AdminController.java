package com.OdkApprenant.demo.OdkApprenant.controllers;

import com.OdkApprenant.demo.OdkApprenant.Admin;
import com.OdkApprenant.demo.OdkApprenant.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "/api-admin")
public class AdminController
{
    @Autowired
    AdminRepository adminRepository;

    @GetMapping("/login")
    public Admin verifyLogin(String email, String password)
    {
        Admin login = this.adminRepository.verifyEmailPassword(email, password);

        return login;
    }
}
