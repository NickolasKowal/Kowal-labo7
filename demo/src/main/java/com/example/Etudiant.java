package com.example;

public class Etudiant {
    private int numDA;
    private String nom;
    private String prenom;
    private Double moyenne;

    public Etudiant(int numDA, String nom, String prenom, Double moyenne) {
        this.numDA = numDA;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getNumDA() {
        return numDA;
    }

    public void setNumDA(int numDA) {
        this.numDA = numDA;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Double moyenne) {
        this.moyenne = moyenne;
    }
}