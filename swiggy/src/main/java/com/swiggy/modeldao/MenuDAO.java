package com.swiggy.modeldao;

import java.util.List;
import com.swiggy.model.Menu;


public interface MenuDAO {
	
	List<Menu>getMenuByRestaurantId(int restaurant_id);

}
