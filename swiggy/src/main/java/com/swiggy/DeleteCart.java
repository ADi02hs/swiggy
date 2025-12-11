package com.swiggy;

import java.io.IOException;

import com.swiggy.modeldaoImpl.CartDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteCart")
public class DeleteCart extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		CartDaoImpl da=new CartDaoImpl();
		
		int cartId =Integer.parseInt(req.getParameter("cartId"));
		
		da.deleteCartItem(cartId);
		
		resp.sendRedirect("CartDisplay");
		
		
	}

}
