package com.system.ujjwalfooddeliveryapi.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.ujjwalfooddeliveryapi.domain.FoodDetails;
import com.system.ujjwalfooddeliveryapi.domain.OrderDetails;
import com.system.ujjwalfooddeliveryapi.repository.FoodRepositoryImpl;
import com.system.ujjwalfooddeliveryapi.repository.OrderRepository;

@Service
public class FoodServiceImpl implements FoodService{

	@Autowired
	FoodRepositoryImpl repository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public List<FoodDetails> getDetails(String origin, String destination) {
		return repository.getFoodByOriginDes(origin, destination);
	}
	
	@Override
	public java.util.List<FoodDetails> searchByRatingPrice(int rating, int price) {
		List<FoodDetails> details = repository.getFoodByRatingPrice(rating, price);
		
		//Sort By Destination
		Collections.sort(details, (u, v)-> u.getDestination().compareTo(v.getDestination()));
		
		return details;
	}

	@Override
	public void getBooking(List<OrderDetails> orders) {
		orderRepository.saveAll(orders);
	}
}
