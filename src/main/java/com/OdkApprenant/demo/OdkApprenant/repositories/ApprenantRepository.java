package com.OdkApprenant.demo.OdkApprenant.repositories;

import com.OdkApprenant.demo.OdkApprenant.Apprenant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ApprenantRepository extends JpaRepository<Apprenant, Integer>
{
    /*_______On fait une requête JPQL personnalisée pour récupérer l'apprenant par email_______*/
    @Query("Select app From Apprenant app Where app.apprenantEmail = :email")
    Optional<Apprenant> findApprenantByEmail(@Param("email") String apprenantEmail);
}
