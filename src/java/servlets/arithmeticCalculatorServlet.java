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
public class arithmeticCalculatorServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set default result value
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String result;
        
        String valueOne = request.getParameter("valueOne");
        String valueTwo = request.getParameter("valueTwo");
        String mathButton = request.getParameter("mathButton");
         
        //if no value has been entered
        if ( valueOne == null || valueOne.equals("") ||
                valueTwo == null || valueTwo.equals("") ){
             
            result = "---";
            request.setAttribute("result", result);
            request.setAttribute("message", "Please enter an both values :)");
            request.setAttribute("valueOne", valueOne);
            request.setAttribute("valueTwo", valueTwo);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        //if the add was pressed
        if ( mathButton.equals("+") ) {
             
             int resultInt = Integer.parseInt(valueOne) + Integer.parseInt(valueTwo); 
             result = String.valueOf(resultInt);
             
             request.setAttribute("result", result);        
         }
         
        //if the minus was pressed
         if ( mathButton.equals("-") ) {
             
            int resultInt = Integer.parseInt(valueOne) - Integer.parseInt(valueTwo); 
            result = String.valueOf(resultInt);
             
            request.setAttribute("result", result);       
         }
         
         //if the multiply was pressed
         if ( mathButton.equals("*") ) {
             
            int resultInt = Integer.parseInt(valueOne) * Integer.parseInt(valueTwo); 
            result = String.valueOf(resultInt);
             
            request.setAttribute("result", result);       
             
         }
         
         //if the mod was pressed
         if ( mathButton.equals("%") ) {
             
            int resultInt = Integer.parseInt(valueOne) % Integer.parseInt(valueTwo); 
            result = String.valueOf(resultInt);
             
            request.setAttribute("result", result);       
             
         }
         
        //return values one and two
         request.setAttribute("valueOne", valueOne);
         request.setAttribute("valueTwo", valueTwo);
         
         //return to the page
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);   
    }
}
