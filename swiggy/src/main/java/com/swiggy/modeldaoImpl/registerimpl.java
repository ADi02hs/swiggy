package com.swiggy.modeldaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.swiggy.model.register;
import com.swiggy.modeldao.registerdao;

public class registerimpl implements registerdao {

	private static final String url = "jdbc:mysql://localhost:3306/swiggy";
	private static final String password = "Adhish@123";
	private static final String username ="root";
	private static final String Insert = "INSERT INTO restaurants(name, image_url, rating, address) VALUES(?,?,?,?)";;



	@Override
	public int addregister(register imp) {
		
		int r=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection	con=DriverManager.getConnection(url, username, password);
		
		
	PreparedStatement	stmt=con.prepareStatement(Insert);
	stmt.setString(1, imp.getName());
	stmt.setString(2, imp.getImage_url());
	stmt.setDouble(3, imp.getRating());
	stmt.setString(4, imp.getAddress());
	
      	r =stmt.executeUpdate();
			
      
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

		return r;
		
	}	

}
