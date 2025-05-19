
package com.xworkz.sparkle.servlet;

import Dto.FirDto;

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



        FirDto firDto=new FirDto();
        firDto.setfirNo(firNo);
        firDto.setcomplaint(complaint);
        firDto.setlocation(location);
        firDto.settime(time);
        System.out.println("FirDto"+firDto);

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("firSuccess.jsp");
        req.setAttribute("FirDto", firDto);
        requestDispatcher.forward(req,resp);
    }
}
