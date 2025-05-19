package com.xworkz.sparkle.servlet;

import Dto.FirDto;
import Dto.LabDto;

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

        LabDto labDto=new LabDto();
        labDto.settestName(testName);
        labDto.setresult(result);
        labDto.settechnician(technician);
        labDto.setLabId(labId);
        System.out.println("LabDto"+labDto);

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("laboratorySuccess.jsp");
        req.setAttribute("LabDto", labDto);
        requestDispatcher.forward(req,resp);
    }
}
