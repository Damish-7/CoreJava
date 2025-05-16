
package com.xworkz.sparkle.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/app1" ,loadOnStartup = 1)
public class FirServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firNo = req.getParameter("firNo");
        String complaint =req.getParameter("complaint");
        String location = req.getParameter("location");
        String time = req.getParameter("time");

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("firSuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("firNo",firNo);
        req.setAttribute("complaint",complaint);
        req.setAttribute("location",location);
        req.setAttribute("time",time);
        requestDispatcher.forward(req,resp);
    }
}
