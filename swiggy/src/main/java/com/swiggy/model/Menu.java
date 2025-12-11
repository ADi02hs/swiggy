package com.swiggy.model;

public class Menu {
	private int id;
    private int restaurant_id;
    private String item_name;
    private double price;
    private String description ;
    private String imageUrl;
	
	public Menu() {
	
	}

	
	public Menu(int id, int restaurant_id, String item_name, double price, String description, String imageUrl) {
		super();
		this.id = id;
		this.restaurant_id = restaurant_id;
		this.item_name = item_name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRestaurant_id() {
		return restaurant_id;
	}


	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public String toString() {
		return "Menu [id=" + id + ", restaurant_id=" + restaurant_id + ", item_name=" + item_name + ", price=" + price
				+ ", description=" + description + ", imageUrl=" + imageUrl + "]";
	}
    
}
