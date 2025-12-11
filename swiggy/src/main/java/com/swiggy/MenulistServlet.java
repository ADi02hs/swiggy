package com.swiggy;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

import com.swiggy.model.Menu;
import com.swiggy.modeldaoImpl.MenuDAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenulistServlet  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		MenuDAOImpl	menu =new MenuDAOImpl();
		
		int restaurantId = Integer.parseInt(req.getParameter("restaurant_id"));
		
		
		//System.out.println(restaurantId);
		
		
		
		List<Menu>menulist=menu.getMenuByRestaurantId(restaurantId);
		
		
		
		for (Menu m : menulist) {
			//System.out.println(m);
			
		}
        
		req.setAttribute("menulist",menulist);
		
		
		req.getRequestDispatcher("menu.jsp").forward(req, resp);
		
		
		
		
		
		
		
		
		
		
		
	
		
//		int restaurantId = Integer.parseInt(req.getParameter("restaurant_id"));
//		
//		System.out.print(restaurantId);
//		
//	MenuDAOImpl	menu =new MenuDAOImpl();
//	
//	List<Menu>menulist=menu.getMenuByRestaurantId(restaurantId);
//		
//	req.setAttribute("menulist",menulist);
//	
//	req.getRequestDispatcher("menu.jsp").forward(req, resp);
////	
	
	

	

		
		
	}

}
