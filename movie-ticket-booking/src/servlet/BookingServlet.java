package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/book")
public class BookingServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contactNumber=servletRequest.getParameter("contactnumber");
        long c_number=0;
        if(contactNumber!=null && contactNumber!=""){
            c_number=Long.parseLong(contactNumber) ;
        }
        String movieName=servletRequest.getParameter("moviename");
        String ticketPrice=servletRequest.getParameter("ticketprice");
        int t_price=0;
        if(ticketPrice!=null && ticketPrice!=""){
            t_price=Integer.parseInt(ticketPrice) ;
        }

        String numberOfTickets=servletRequest.getParameter("numberoftickets");
        int number_tickets=0;
        if(numberOfTickets!=null && numberOfTickets!=""){
            number_tickets=Integer.parseInt(numberOfTickets) ;
        }
        int payableAmount =t_price*number_tickets;
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>Thanks for Booking the Ticket </h1>"+name);
        writer.println("<h2>Your Total Amount is: </h2>"+payableAmount);


    }
}