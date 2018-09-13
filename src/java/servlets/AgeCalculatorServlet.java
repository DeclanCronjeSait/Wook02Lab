/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 687333
 */
public class AgeCalculatorServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get the age
        String age = request.getParameter("age");
        
        //Check if age has a value
        if ( age == null || age.equals("") ){
            request.setAttribute("message", "Please enter an age :)");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        //if the age has a value increment the age and retrun to the page
        int ageNumber = Integer.parseInt(age) + 1;
        
        age = String.valueOf(ageNumber);
        
        //return age
        request.setAttribute("age", age);
        
        //REturn to page
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);   
    }
}
