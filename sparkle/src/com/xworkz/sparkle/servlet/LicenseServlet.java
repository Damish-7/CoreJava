package com.xworkz.sparkle.servlet;

import Dto.LabDto;
import Dto.LicenseDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/app3" ,loadOnStartup = 1)
public class LicenseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String licenseNo = req.getParameter("licenseNo");
        String issuedDate = req.getParameter("issuedDate");
        String expiryDate = req.getParameter("expiryDate");
        String licenseType = req.getParameter("licenseType");

        LicenseDto licenseDto=new LicenseDto();
        licenseDto.setlicenseNo(licenseNo);
        licenseDto.setissuedDate(issuedDate);
        licenseDto.setexpiryDate(expiryDate);
        licenseDto.setlicenseType(licenseType);
        System.out.println("LicenseDto"+licenseDto);


        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("licenseSuccess.jsp");
        req.setAttribute("LicenseDto", licenseDto);
        requestDispatcher.forward(req,resp);
    }
}
