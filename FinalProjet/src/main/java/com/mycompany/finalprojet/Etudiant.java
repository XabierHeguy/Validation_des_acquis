package com.mycompany.finalprojet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xheguy
 */
public class Etudiant {
    private String id;
    private String nom;
    private double moyenne;
    private String image;

    public Etudiant(String id, String nom, double moyenne, String image) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    
    public boolean equals(Etudiant etudiant){
        return etudiant.getId().equals(this.getId());
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    
}
