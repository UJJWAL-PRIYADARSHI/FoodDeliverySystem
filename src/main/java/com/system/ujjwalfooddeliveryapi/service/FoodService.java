package com.system.ujjwalfooddeliveryapi.service;

import java.util.List;

import com.system.ujjwalfooddeliveryapi.domain.FoodDetails;
import com.system.ujjwalfooddeliveryapi.domain.OrderDetails;

public interface FoodService {
	public List<FoodDetails> getDetails(String origin, String destination);
	
	public List<FoodDetails> searchByRatingPrice(int rating, int price);
	
	public void getBooking(List<OrderDetails> order);
}
