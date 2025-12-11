package com.swiggy.modeldaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.swiggy.model.Menu;
import com.swiggy.modeldao.MenuDAO;

public class MenuDAOImpl implements MenuDAO {

	private static final String url = "jdbc:mysql://localhost:3306/swiggy";
	private static final String username = "root";
	private static final String password = "Adhish@123";
	private static final String Query = "SELECT * FROM menu WHERE restaurant_id = ? ";

	@Override
	public List<Menu> getMenuByRestaurantId(int restaurant_id) {
		
		List<Menu> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, username, password);
			
			PreparedStatement stmt=con.prepareStatement(Query);
			   
	           stmt.setInt(1, restaurant_id);
	           
	          ResultSet r=stmt.executeQuery();
	          
	          while (r.next()) {
			   Menu m=new Menu();
			   
			   m.setId(r.getInt("id"));
			   m.setRestaurant_id(r.getInt("restaurant_id"));
	           m.setItem_name(r.getString("item_name"));
	           m.setPrice(r.getDouble("price"));
	           m.setImageUrl(r.getString("image_url"));
	           m.setDescription(r.getString("description"));
	           list.add(m);
	           
	           
	          
	           
	    		
			}
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		
		}
		
		return list;
  }
	
}
