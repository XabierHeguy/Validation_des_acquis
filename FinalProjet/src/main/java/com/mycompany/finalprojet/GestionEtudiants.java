/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojet;

import java.util.ArrayList;

/**
 *
 * @author xheguy
 */
public class GestionEtudiants {
    private ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    public GestionEtudiants() {
        Etudiant bessas = new Etudiant("1", "Bessas", 12.0, "img1.jpg");
        Etudiant gauthier = new Etudiant("2", "Gauthier", 14.0, "img2.jpg");
        Etudiant hamon = new Etudiant("3", "Hamon", 15.0, "img3.jpg");
        Etudiant mehali = new Etudiant("4", "Mehali", 13.0, "img5.jpg");
        Etudiant parenteau = new Etudiant("5", "Parenteau", 11.0, "img4.jpg");
        
        listeEtudiants.add(bessas);
        listeEtudiants.add(gauthier);
        listeEtudiants.add(hamon);
        listeEtudiants.add(mehali);
        listeEtudiants.add(parenteau);
        
    }   

    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }
    
    
}
