package com.swiggy;

import java.io.IOException;

import com.swiggy.model.Cart;
import com.swiggy.modeldaoImpl.CartDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addToCart")
public class AddToCartServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {         
			
			

		    int menuId = Integer.parseInt(req.getParameter("id"));
		    int restaurantId = Integer.parseInt(req.getParameter("restaurant_id"));
		    double price = Double.parseDouble(req.getParameter("price"));
		
		
		
        int quantity=1;
        
        int userId=1;
        
        double totalPrice = price * quantity;
        
       Cart c=new Cart();
       
       c.setMenu_id(menuId);
       c.setRestaurant_id(restaurantId);
       c.setUser_id(userId);
       c.setPrice(price);
       c.setQuantity(quantity);
       c.setTotal_price(price);
       
       
    CartDaoImpl d=  new CartDaoImpl();
     boolean done=d.addToCart(c);
    
    if (done) {
    	resp.sendRedirect("menu?restaurant_id=" + restaurantId);
	}else {
		resp.sendRedirect("menu?restaurant_id=" + restaurantId + "&error=failed");
	}
 }
    
    
     
		catch (Exception e) {
		 e.printStackTrace();
	}
	
}

}		
		
	
//     @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	 try {
//		
////        	int menuId =Integer.parseInt(req.getParameter("id"));
////			int restaurantId = Integer.parseInt(req.getParameter("restaurant_id"));
////            double price = Double.parseDouble(req.getParameter("price"));
////
////     	     	System.out.println("MenuId="+ req.getParameter("menu_id"));
////    			System.out.print("restaurantId="+req.getParameter("restaurant_id"));
////   		     	System.out.print("price"+req.getParameter("price"));
//			
//    		 
//                
//			    
//
//			    int menuId = Integer.parseInt(req.getParameter("id"));
//			    int restaurantId = Integer.parseInt(req.getParameter("restaurant_id"));
//			    double price = Double.parseDouble(req.getParameter("price"));
//			
//			   
//			    System.out.println("id = " + req.getParameter("id"));
//			    System.out.println("restaurant_id = " + req.getParameter("restaurant_id"));
//			    System.out.println("Price = " + req.getParameter("price"));
//			
//			
//         int quantity=1;
//         
//         int userId=1;
//         
//         double totalPrice = price * quantity;
//         
//        Cart c=new Cart();
//        
//        c.setMenu_id(menuId);
//        c.setRestaurant_id(restaurantId);
//        c.setPrice(price);
//        c.setQuantity(quantity);
//        c.setTotal_price(price);
//        
//     CartDaoImpl d=  new CartDaoImpl();
//      boolean done=d.addToCart(c);
//     
//     if (done) {
//     	req.getRequestDispatcher("menu.jsp").forward(req, resp);
//		}
//     else {
//			resp.sendRedirect("menu.jsp?error=faild");
//		}
//			
//     
//     
//     
//     
//		} catch (Exception e) {
//			 e.printStackTrace();
//		}
//    }
//}
