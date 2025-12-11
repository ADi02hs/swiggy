package com.swiggy.model;

public class register {
	private int id;
    private String name;
    private String image_url;
    private double rating;  
    private String address;
	
	public register() {
		
	}

	
	public register(int id,   String  name, String image_url, double rating,  String address) {
		super();
		this.id=id;
		this.name = name;
		this.image_url = image_url;
		this.rating = rating;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage_url() {
		return image_url;
	}


	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}





	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "register [name=" + name + ", image_url=" + image_url + ", rating=" + rating 
				+ ", address=" + address + "]";
	}   

}






