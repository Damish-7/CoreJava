package com.xworkz.sparkle.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/app" ,loadOnStartup = 1)
public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String feedback=req.getParameter("feedback");
        String rating = req.getParameter("rating");
        String suggestion = req.getParameter("suggestion");
        String gender =req.getParameter("gender");

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("feedbackSuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("feedback",feedback);
        req.setAttribute("rating",rating);
        req.setAttribute("suggestion",suggestion);
        req.setAttribute("gender",gender);
        requestDispatcher.forward(req,resp);
    }
}
