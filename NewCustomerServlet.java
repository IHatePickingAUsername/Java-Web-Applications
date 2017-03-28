import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCustomerServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String email = request.getParameter("email");
        
        // Validate the parameters
        if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty()
             || city.isEmpty() || state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
            String message = "Please fill out all fields.";
            String url = "/new_customer.html";
            request.setAttribute("message", message);
        } else {
            String url = "/success.html";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }
}
