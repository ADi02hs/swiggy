package com.swiggy.modeldaoImpl;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.swiggy.model.*;

public class restaurantdaoimpl {
	
	
	private static final String url = "jdbc:mysql://localhost:3306/swiggy";
	private static final String username = "root";
	private static final String password = "Adhish@123";
	private static final String sql = "SELECT * FROM restaurants";

	public List<register>getALLRestauarents(){
        
		List<register>list=new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection	con=DriverManager.getConnection(url, username, password);
			
			
			PreparedStatement stmt=con.prepareStatement(sql);
			
			  ResultSet	rs=stmt.executeQuery();
			  
			  while (rs.next()) {
			  register	r=new register();
			   r.setId(rs.getInt("id"));
			   r.setName(rs.getString("name"));
			   r.setImage_url(rs.getString("image_url"));
			   r.setRating(rs.getDouble("rating"));
			   r.setAddress(rs.getString("address"));
			   
			   list.add(r);
				
			}
			  
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return list	;
	}

	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		