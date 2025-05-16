package com.xworkz.sparkle.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/app2" ,loadOnStartup = 1)
public class LaboratoryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String testName = req.getParameter("testName");
        String result = req.getParameter("result");
        String technician = req.getParameter("technician");
        String labId = req.getParameter("labId");

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("feedbackSuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute(" testName", testName);
        req.setAttribute("result",result);
        req.setAttribute("technician",technician);
        req.setAttribute("labId",labId);
        requestDispatcher.forward(req,resp);
    }
}
