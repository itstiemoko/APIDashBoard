package com.OdkApprenant.demo.OdkApprenant.repositories;

import com.OdkApprenant.demo.OdkApprenant.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
    @Query("Select admin From Admin admin Where admin.adminEmail = :email and admin.adminPassword = :password")
    Admin verifyEmailPassword(@Param("email") String email, @Param("password") String password);
}
