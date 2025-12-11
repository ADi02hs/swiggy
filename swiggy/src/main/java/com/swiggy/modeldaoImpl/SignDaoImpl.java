package com.swiggy.modeldaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.swiggy.model.Sign;
import com.swiggy.modeldao.signDao;

public class SignDaoImpl implements signDao {

	private static final String URL = "jdbc:mysql://localhost:3306/swiggy";
	private static final String username = "root";
	private static final String password = "Adhish@123";
	private static final String insert = "INSERT INTO user(name, mobileNumber) VALUES(?,?)";

	@Override
	public int insertUSer(Sign u) {
		
		int r=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection	con=DriverManager.getConnection(URL,username,password);
			
		PreparedStatement	st=con.prepareStatement(insert);
			
		st.setString(1, u.getMobileNumber());
		
		
		st.setString(2, u.getName());
		
		r=st.executeUpdate();
			
//		System.out.println(r);	
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return r;
	}

}
