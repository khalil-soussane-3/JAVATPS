package com.example.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Hashtable;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    private String username ;
    private String pwd ;
    Hashtable<String,String> hashMap;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       request.getRequestDispatcher("login.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        username=request.getParameter("uname");
        pwd=request.getParameter("psw");
        hashMap.put("kahlil1","01234");
        hashMap.put("khalil2","102030");

        for(int i=0;i<= hashMap.size();i++){
            if(hashMap.containsKey(username) && hashMap.containsValue(pwd)){*/
                out.println("<html>");
                out.println("<HEAD>");
                out.println("<TITLE>Affichage</TITLE>");
                out.println("</HEAD>");
                out.println("<BODY>");
                out.println("<H1>Affichage des Donnees </H1>");
                out.println("</br>");
                out.println("USERNAME : " +username);
                out.println("</br>");
                out.println("PASSWORD  : "+pwd);
                out.println("</br>");
                out.println("</body");
                out.println("</html>");
            }else {
                out.println("<html>");
                out.println("<HEAD>");
                out.println("<TITLE>Affichage</TITLE>");
                out.println("</HEAD>");
                out.println("<BODY>");
                out.println("<script>");
                out.println("try {" +
                        "  adddlert(\"Welcome guest\");" +
                        "}" +
                        "catch(err) {" +
                        "  document.getElementById(\"demo\").innerHTML = err.message;" +
                        "}");
                out.println("</script>");
                out.println("</body>");
                out.println("</html>");
            }
        }

    }
}