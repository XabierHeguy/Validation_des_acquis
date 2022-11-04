/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.finalprojet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xheguy
 */
@WebServlet(urlPatterns = {"/AffichageEtudiants"})
public class AffichageEtudiants extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        GestionEtudiants gestionEtudiants = new GestionEtudiants();
        ArrayList<Etudiant> listeEtudiants = gestionEtudiants.getListeEtudiants();
        request.getSession().setAttribute("listeEtudiants", listeEtudiants);
        request.getRequestDispatcher("WEB-INF/jspetudiants.jsp").forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
