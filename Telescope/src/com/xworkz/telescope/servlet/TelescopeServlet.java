package com.xworkz.telescope.servlet;

import com.xworkz.telescope.dto.TelescopeDto;
import com.xworkz.telescope.repository.TelescopeRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/telescope")
public class TelescopeServlet extends HttpServlet {




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date=req.getParameter("date");
        int count=Integer.parseInt(req.getParameter("count"));
        boolean soapUsed=Boolean.parseBoolean(req.getParameter("soapUsed"));;
        String location=req.getParameter("location");
        int duration=Integer.parseInt(req.getParameter("duration"));
        String remarks=req.getParameter("remarks");

        TelescopeDto telescopeDto=new TelescopeDto();
        telescopeDto.setDate(date);
        telescopeDto.setCount(count);
        telescopeDto.setSoapUsed(soapUsed);
        telescopeDto.setLocation(location);
        telescopeDto.setDuration(duration);
        telescopeDto.setRemarks(remarks);
        TelescopeRepositoryImpl telescopeService=new TelescopeRepositoryImpl();
        boolean saved=telescopeService.save(telescopeDto);
        if(saved){
            System.out.println("Successfully saved the information.");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Sucess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("productDto", telescopeDto);
            requestDispatcher.forward(req,resp);

        } else {
            System.out.println(" Error in saving the information.");
        }
    }
}