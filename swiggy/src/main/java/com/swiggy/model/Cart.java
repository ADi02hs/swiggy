package com.swiggy.model;

public class Cart {
	
	private int cart_id;
	private int menu_id;
	private int restaurant_id;
	private int user_id;
	private int quantity;
	private double price;
	private double total_price;
	private String added_at;
	
	public Cart() {
		
	}

	
	public Cart(int cart_id, int menu_id, int restaurant_id, int user_id, int quantity, double price,
			double total_price, String added_at) {
		super();
		this.cart_id = cart_id;
		this.menu_id = menu_id;
		this.restaurant_id = restaurant_id;
		this.user_id = user_id;
		this.quantity = quantity;
		this.price = price;
		this.total_price = total_price;
		this.added_at = added_at;
	}


	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	public int getMenu_id() {
		return menu_id;
	}


	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}


	public int getRestaurant_id() {
		return restaurant_id;
	}


	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}


	public String getAdded_at() {
		return added_at;
	}


	public void setAdded_at(String added_at) {
		this.added_at = added_at;
	}


	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", menu_id=" + menu_id + ", restaurant_id=" + restaurant_id + ", user_id="
				+ user_id + ", quantity=" + quantity + ", price=" + price + ", total_price=" + total_price
				+ ", added_at=" + added_at + "]";
	}
	
	
	
	

}
