<%-- 
    Document   : jspetudiants
    Created on : 4 nov. 2022, 09:46:58
    Author     : xheguy
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            table, caption, th, td {
                border: 1px solid;
                text-align: center;
            }
            img {
                width : 100%;
                height : 100%;
            }
        </style>
        <title>Liste étudiants</title>
    </head>
    <body>
        <h1>Liste des étudiants</h1>
        
        <table>
            <thead>
                <tr>
                  <th>id</th>
                  <th>nom</th>
                  <th>moyenne</th>
                  <th>image</th>
                </tr>
            </thead>
            <tbody>
                
                    <c:forEach items="${ listeEtudiants }" var="etudiant">
                        <tr>
                        <td width="40"><c:out value="${ etudiant.getId() }" /></td>
                        <td><c:out value="${ etudiant.getNom() }" /></td>
                        <td><c:out value="${ etudiant.getMoyenne() }" /></td>
                        <td width="150" height = "150"><img src="images/${ etudiant.getImage() }"></td>
                        </tr>
                    </c:forEach>
                
            </tbody>
        </table>
    </body>
</html>
