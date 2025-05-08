package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class EventRegistrationServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        long contactNumber = 0;
        if (contact != null && contact!="") {
            contactNumber = Long.parseLong(contact);
        }

        String eventName = request.getParameter("event");
        String attendeesStr = request.getParameter("attendees");
        int numberOfAttendees = 0;
        if (attendeesStr != null && attendeesStr!="") {
            numberOfAttendees = Integer.parseInt(attendeesStr);
        }

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<h1>Registration Successful</h1>");
        writer.println("<h2>Thank you, " + name + "!</h2>");
        writer.println("<p>You have registered for the event: <strong>" + eventName + "</strong></p>");
        writer.println("<p>Number of Attendees: " + numberOfAttendees + "</p>");
        writer.println("<p>Confirmation sent to: " + email + "</p>");
    }
}
