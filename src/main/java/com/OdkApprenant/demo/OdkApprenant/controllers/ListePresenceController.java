package com.OdkApprenant.demo.OdkApprenant.controllers;

import com.OdkApprenant.demo.OdkApprenant.ListePresence;
import com.OdkApprenant.demo.OdkApprenant.services.ListePresenceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/presence")
public class ListePresenceController
{
    @Autowired
    ListePresenceServiceImp listePresenceServiceImp;

    @GetMapping("/getAllListePresence")
    public List<ListePresence> getAllListePresence()
    {
        return listePresenceServiceImp.getAllListePresence();
    }

    @PostMapping("/addListePresence")
    public String addListePresence(@RequestBody ListePresence listePresence)
    {
        return this.listePresenceServiceImp.addListePresence(listePresence);
    }
}
