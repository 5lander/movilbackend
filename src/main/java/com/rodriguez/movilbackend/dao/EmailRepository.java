/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rodriguez.movilbackend.dao;

import com.rodriguez.movilbackend.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario iTC
 */
 @Repository
public interface EmailRepository extends JpaRepository<Email, String>{
       

}
