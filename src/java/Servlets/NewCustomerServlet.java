package Servlets;

import JavaBeans.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.UserDB;

public class NewCustomerServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String email = request.getParameter("email");
        
        // Validate the parameters
        if (!firstName.isEmpty() && !lastName.isEmpty() && !phone.isEmpty() && !address.isEmpty()
             && !city.isEmpty() && !state.isEmpty() && !zip.isEmpty() && !email.isEmpty() &&
                firstName != null && lastName != null && phone != null && address != null &&
                city != null && state != null && zip != null && email != null) {
            User user = new User(firstName, lastName, phone, 
                    address, city, state, zip, email);
            String username = user.getLastName() + user.getZip();
            user.setUsername(username);
            user.setPassword("welcome1");
            request.setAttribute("user", user);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            UserDB.insert(user);
            String url = "/success.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        } else {
            String message = "Please fill out all fields.";
            String url = "/new_customer.html";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }
}
