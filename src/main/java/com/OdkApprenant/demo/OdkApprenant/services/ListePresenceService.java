package com.OdkApprenant.demo.OdkApprenant.services;

import com.OdkApprenant.demo.OdkApprenant.ListePresence;

import java.util.List;

public interface ListePresenceService
{
    List<ListePresence> getAllListePresence();
    String addListePresence(ListePresence listePresence);
}
