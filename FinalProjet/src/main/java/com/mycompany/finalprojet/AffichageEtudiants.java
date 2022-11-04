/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.finalprojet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
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
    
    public  void init(ServletConfig config) {
	
   String url = config.getInitParameter("http://127.0.0.1:51748") ;
   String login = config.getInitParameter("admin") ;
   String passwd = config.getInitParameter("s7q3aeic2!") ;
   Statement stm = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Postgresql chargé");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Postgresql non trouvé");
            Logger.getLogger(AffichageEtudiants.class.getName()).log(Level.SEVERE, null, ex);
        }
	
   Connection con;
        try {
            con = DriverManager.getConnection(url, login, passwd);
            System.out.println("Connexion à " + url + " établie");
            stm = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Connexion à " + url + " impossible");
            Logger.getLogger(AffichageEtudiants.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            requete = "CREATE DATABASE etudiants;"
        }
	
  // config.getServletContext().setAttribute("db-connection", con) ;
}

}
