package com.swiggy;
import com.swiggy.model.register;

import java.io.IOException;

import java.io.PrintWriter;


import com.swiggy.modeldaoImpl.registerimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	        int id=Integer.parseInt(req .getProtocolRequestId());
		    String name=req.getParameter("name");
	        String image = req.getParameter("image_url");
	        float rating = Float.parseFloat(req.getParameter("rating"));
	        String address = req.getParameter("address");
	        
	     register reg=new register(id, name, image, rating, address);   
	      
	     
	      registerimpl  imp=new registerimpl();
	      
                     
	      int res=imp.addregister(reg);
	      
	      PrintWriter out=resp.getWriter();
	      
	      if (res==1) {
	    	  out.print("hey "+ name + " you are sucessfuffl login ");
			
		}else {
			out.print("Sumthing went wrong tri after sum time ");
		}
	     
		
	}

}
