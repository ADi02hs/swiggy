package com.swiggy.modeldao;

import java.util.List;

import com.swiggy.model.Cart;

public interface CartDao {
	
	//inserting cart
	boolean addToCart(Cart c);
	
	//showing cart item for user
	List<Cart>getCartItemByUser(int userId);
	
	//for update quantity
	boolean updateQuantity(int cartId,int quantity);
	
	//for removing an item
	boolean deleteCartItem(int cartId);
	
	//for cleaning cart after placing order
	boolean clearCart(int userId);
	

	
	

}
