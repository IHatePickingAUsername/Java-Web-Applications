package Servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="LoginServlet", urlPatterns={"/login"})
public class LoginServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("jsmith@toba.com".equals(username) && "letmein".equals(password)) {
            String url = "/account_activity.html";
            request.getSession().setAttribute("firstName", "John");
            request.getSession().setAttribute("lastName", "Smith");
            getServletContext().getRequestDispatcher(url).forward(request, response);
        } else {
            String url = "/login_failure.html";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }
}