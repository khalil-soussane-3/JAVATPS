package com.example.tp11ex2;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String cne;
    private String nom ;
    private String prenom;
    private String ville;
    private String daten;
    private String bourse;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher rq = request.getRequestDispatcher("/index.jsp");
        rq.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        cne=request.getParameter("cne");
        nom=request.getParameter("nom");
        prenom=request.getParameter("prenom");
        ville=request.getParameter("ville");
        daten=request.getParameter("dtn");
        bourse=request.getParameter("bourse");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Affichage</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<H1>Affichage</H1>");
        out.println("CNE : " + cne);
        out.println("</br>");

        out.write("NOM : " + nom);
        out.write("</br>");
        out.write("PRENOM : " + prenom);
        out.write("</br>");
        out.write("VILLE : " + ville);
        out.write("</br>");
        out.write("DATE DE NAISSANCE : " + daten);
        out.write("</br>");
        out.write("BOURSE : " + bourse);
        out.write("</br>");
        out.write("</BODY>");
        out.write("</HTML>");
        out.close();
    }


}