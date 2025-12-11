package com.swiggy;

import java.io.IOException;
import java.util.List;

import com.swiggy.model.Cart;
import com.swiggy.modeldaoImpl.CartDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/CartDisplay")
public class DisplayCart extends HttpServlet{
	
	private CartDaoImpl da=new CartDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int user=1;
		double GrandTotal=0;
		
	 List <Cart> cartlist=da.getCartItemByUser(user);
	 
	 
	 if (cartlist!=null) {
		 for(Cart c: cartlist) {
			GrandTotal+=c.getTotal_price();
//			 System.out.println(c);
		 }
		
	}
	 req.setAttribute("GrandTotal", GrandTotal);
	 req.setAttribute("cart", cartlist);
	 
	 req.getRequestDispatcher("cart.jsp").forward(req, resp);
	 
	
	 
	}
	
}
