package com.example.gestionpersonne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "ControlPersonne", value = "/ControlPersonne")
public class ControlPersonne extends HttpServlet {
    String nom;
    String prenom;
    String mail;
    String sex;
    String mdp;
    String mdpc;
    String pays;
    String language;
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        nom=request.getParameter("nom");
        prenom=request.getParameter("prenom");
        mail=request.getParameter("mail");
        sex=request.getParameter("sex");
        mdp=request.getParameter("mdp");
        mdpc=request.getParameter("mdpc");
        pays=request.getParameter("pays");
        language=request.getParameter("language");
        if(mdp.equals(mdpc)){
            System.out.println(nom);
            System.out.println(prenom);
            System.out.println(mail);
            System.out.println(sex);
            System.out.println(mdp);
            System.out.println(mdpc);
            System.out.println(language);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/base_persoones","root","");
                    Statement stat =cnx.createStatement();
                    String sqlInsert = "insert into t_personne values('"+nom+"','"+prenom+"','"+mail+"','"+sex+"'" +
                            ",'"+mdp+"','"+mdpc+"','"+mail+"','"+language+"')";
                    PreparedStatement p = cnx.prepareStatement(sqlInsert);
                    stat.executeUpdate(sqlInsert);
                    stat.close();
                    cnx.close();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        }else{
            System.out.println("password Incorrect");
        }
        request.getRequestDispatcher("resultat.jsp").forward(request,response);
    }
}
