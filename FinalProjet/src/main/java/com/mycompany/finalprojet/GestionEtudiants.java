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
        Etudiant bessas = new Etudiant("1", "Bessas", 12.0);
        Etudiant gauthier = new Etudiant("2", "Gauthier", 14.0);
        Etudiant hamon = new Etudiant("3", "Hamon", 15.0);
        Etudiant mehali = new Etudiant("4", "Mehali", 13.0);
        Etudiant parenteau = new Etudiant("5", "Parenteau", 11.0);
        
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
