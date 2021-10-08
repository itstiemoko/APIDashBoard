package com.OdkApprenant.demo.OdkApprenant.controllers;


import com.OdkApprenant.demo.OdkApprenant.Apprenant;
import com.OdkApprenant.demo.OdkApprenant.services.ApprenantServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*_____________Le contrôleur de notre apprenant____________*/
@CrossOrigin
@RestController
@RequestMapping(path = "/api")
public class ApprenantController
{
    ApprenantServiceImp apprenantServiceImp;

    public ApprenantController(ApprenantServiceImp apprenantServiceImp)
    {
        this.apprenantServiceImp = apprenantServiceImp;
    }

    @GetMapping("/listApprenants")
    public List<Apprenant> getListApprenants()
    {
        return this.apprenantServiceImp.listApprenant();
    }

    @GetMapping("/getInfoApprenantById/{apprenantId}")
    public Apprenant getInfoApprenantById(@PathVariable Integer apprenantId)
    {
        return this.apprenantServiceImp.getInfoApprenantById(apprenantId);
    }

    @PostMapping("/addApprenant")
    public String addApprenant(@RequestBody Apprenant apprenant)
    {
        return this.apprenantServiceImp.addApprenant(apprenant);
    }

    @DeleteMapping("/deleteApprenant/{apprenantId}")
    public String deleteApprenant(@PathVariable("apprenantId") Integer apprenantId)
    {
        return this.apprenantServiceImp.deleteApprenant(apprenantId);
    }

    @PutMapping("modifyApprenant/{apprenantId}")
    public void modifyApprenant(@PathVariable("apprenantId") Integer apprenantId, @RequestBody Apprenant apprenant)
    {
        this.apprenantServiceImp.modifierApprenant(apprenantId, apprenant);
    }

    @GetMapping("/isLoginPasswordExist")
    public boolean verifyLoginPassword(@RequestParam String login, @RequestParam String password)
    {
        return this.apprenantServiceImp.verifyLoginAndPassword(login, password);
    }
}
