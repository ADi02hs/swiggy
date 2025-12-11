package com.swiggy.modeldaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.swiggy.model.Cart;
import com.swiggy.modeldao.CartDao;

public class CartDaoImpl implements CartDao {

	private static final String url = "jdbc:mysql://localhost:3306/swiggy";
	private static final String username = "root";
	private static final String password = "Adhish@123";
	
	
	@Override
	public boolean addToCart(Cart c) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String insert = "INSERT INTO cart(menu_id,restaurant_id, user_id, quantity, price, total_price) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement st = con.prepareStatement(insert);

			st.setInt(1, c.getMenu_id());
			st.setInt(2, c.getRestaurant_id());
			st.setInt(3, c.getUser_id());
			st.setInt(4, c.getQuantity());
			st.setDouble(5, c.getPrice());
			st.setDouble(6, c.getTotal_price());

			return st.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	@Override
	public List<Cart> getCartItemByUser(int userId) {

		List<Cart> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String select = "SELECT * FROM cart WHERE user_id=?";
			PreparedStatement st = con.prepareStatement(select);

			st.setInt(1, userId);

			ResultSet r = st.executeQuery();

			while (r.next()) {

				Cart c = new Cart();

				c.setCart_id(r.getInt("cart_id"));
				c.setMenu_id(r.getInt("menu_id"));
				c.setRestaurant_id(r.getInt("restaurant_id"));
				c.setUser_id(r.getInt("user_id"));
				c.setQuantity(r.getInt("quantity"));
				c.setPrice(r.getDouble("price"));
				c.setTotal_price(r.getDouble("total_price"));
				c.setAdded_at(r.getString("added_at"));

				list.add(c); // FIXED
			}

			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	
	@Override
	public boolean updateQuantity(int cartId, int quantity) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String update = "UPDATE cart SET quantity=?, total_price = price * ? WHERE cart_id=?";

			PreparedStatement st = con.prepareStatement(update);

			st.setInt(1, quantity);
			st.setInt(2, quantity);
			st.setInt(3, cartId);

			return st.executeUpdate() > 0; // FIXED

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	
	@Override
	public boolean deleteCartItem(int cartId) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String delete = "DELETE FROM cart WHERE cart_id=?";

			PreparedStatement st = con.prepareStatement(delete);

			st.setInt(1, cartId);

			return st.executeUpdate() > 0; // FIXED

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	
	@Override
	public boolean clearCart(int userId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String delete = "DELETE FROM cart WHERE user_id=?";

			PreparedStatement st = con.prepareStatement(delete);
			st.setInt(1, userId);

			return st.executeUpdate() > 0; // FIXED

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return false;
	} 
}