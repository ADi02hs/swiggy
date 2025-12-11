package com.swiggy;

import java.io.IOException;

import com.swiggy.modeldaoImpl.CartDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateQuantity")
public class UpdateQuantity  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		int cartId =Integer.parseInt(req.getParameter("cartId"));
		
		int quantity =Integer.parseInt(req.getParameter("quantity"));
		
		String action =req.getParameter("action");
		
		if (action.equals("inc")) {
			quantity++;
			
		}else if(action.equals("dec") && quantity> 1){
			quantity--;
		}
		
		CartDaoImpl da=new CartDaoImpl();
		da.updateQuantity(cartId, quantity);
		
		resp.sendRedirect("CartDisplay");
		
		
	}

}
