package com.system.ujjwalfooddeliveryapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.ujjwalfooddeliveryapi.domain.FoodDetails;
import com.system.ujjwalfooddeliveryapi.domain.OrderDetails;
import com.system.ujjwalfooddeliveryapi.service.FoodServiceImpl;

@RestController
public class FoodDeliveryController {

	@Autowired
	FoodServiceImpl foodServiceImple;
	
	@RequestMapping(value = "/food/browse", method = RequestMethod.GET)
	public List<FoodDetails> getFoodDetails(@RequestParam("origin") String origin, @RequestParam("des") String des){
		return foodServiceImple.getDetails(origin, des);
	}
	
	@RequestMapping(value= "/food/searchByRatePrice", method = RequestMethod.GET)
	public List<FoodDetails> getFoodByRatingPrice(@RequestParam("rating") int rating,@RequestParam("price") int price){
		return foodServiceImple.searchByRatingPrice(rating, price);
	}
	
	@RequestMapping(value= "/food/bookOrder", method = RequestMethod.POST, consumes = ("Application/json"))
	public void bookOrder(@RequestBody List<OrderDetails> details) {
		foodServiceImple.getBooking(details);
	}
}
