package com.swiggy;

import java.io.IOException;
import java.util.List;

import com.swiggy.model.register;
import com.swiggy.modeldaoImpl.restaurantdaoimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RestarantListServlet") 
public class RestarantListServlet  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("resaturent called");
		restaurantdaoimpl dao=new restaurantdaoimpl();
		
		List<register>restauraList=dao.getALLRestauarents();
	

		req.setAttribute("restaurants", restauraList);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		
//		System.out.println(restauraList);
		
		
		
		
		

		
	}

}
