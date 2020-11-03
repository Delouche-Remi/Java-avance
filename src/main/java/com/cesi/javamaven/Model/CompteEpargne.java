package com.cesi.javamaven.Model;

import javax.persistence.*;

@Entity
public class CompteEpargne { 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCompte;
    
    private String numero;
    
    private double solde;
    private double tauxInteret;

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

}