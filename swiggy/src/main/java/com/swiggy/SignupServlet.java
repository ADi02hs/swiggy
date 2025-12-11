package com.swiggy;

import java.io.IOException;
import java.io.PrintWriter;

import com.swiggy.model.Sign;
import com.swiggy.modeldaoImpl.SignDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Sign")
public class SignupServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		
		String mobileNumber=req.getParameter("mobileNumber");
		
		Sign s=new Sign( mobileNumber,name);
		
	  SignDaoImpl si =  new SignDaoImpl();
	
	     int  r =si.insertUSer(s);
	
       PrintWriter out=resp.getWriter();
	      
	      if (r==1) {
//	    	  out.print("hey "+ name + " you are sucessfuffl login ");
	    	  resp.sendRedirect("index.jsp");
			
		}else {
			out.print("Sumthing went wrong tri after sum time ");
		}
		
		
		
		
		
	}

}
