/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.javamaven.controller;

import com.cesi.javamaven.model.Compte;
import com.cesi.javamaven.model.CompteCourant;
import com.cesi.javamaven.repository.CompteCourantRepository;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/1")
public class CompteController {
    @Autowired
    private CompteCourantRepository compteCourantRepository;
    
    @PostMapping("/compteCourant")
    public void createCompteCourant(CompteCourant newCompte) {
        compteCourantRepository.save(newCompte);
    }

    @DeleteMapping("/compteCourant/{idCompte}")
    public void deleteCompteCourant(@PathVariable int idCompte) {
        compteCourantRepository.deleteById(idCompte);
        System.out.println("Le compte a bien été supprimé.");

        CompteCourant compteCourant = new CompteCourant();
        try {
            compteCourant = compteCourantRepository.findById(idCompte).get();
            compteCourantRepository.delete(compteCourant);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Ce compte courant n'existe pas");
        }
    }

    @PostMapping("/compteCourant/{idCompte")
    public void updateCompteCourant(int idCompte){
        compteCourantRepository.findById(idCompte);
    }
}