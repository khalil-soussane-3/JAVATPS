package com.example.tp11;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        Enumeration a= request.getParameterNames();
        while(a.hasMoreElements()){
            String v = (String) a.nextElement();
            out.write(v);
            out.write("   :   ");
            String [] pv = request.getParameterValues(v);
            for(int i =0;i<pv.length;i++){
                out.write(pv[i]);
                out.write("</br>");
            }
        }

    }
}