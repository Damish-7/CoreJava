package servlet;

import javax.lang.model.element.Name;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class FeedBackServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running in feedbackservlet");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contact=servletRequest.getParameter("contact");
        String feedback=servletRequest.getParameter("feedback");

        System.out.println(name+" " +email+ " " +contact+ " "+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(name +" Thankyou for submitting the feedback");
    }
}
