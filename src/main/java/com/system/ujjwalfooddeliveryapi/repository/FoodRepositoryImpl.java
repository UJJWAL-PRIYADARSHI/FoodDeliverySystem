package com.system.ujjwalfooddeliveryapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.system.ujjwalfooddeliveryapi.domain.FoodDetails;

@Repository
public interface FoodRepositoryImpl extends FoodRepository{
	@Query(value = "select * from food_details where origin = ?1 and des = ?2", nativeQuery = true)
	public List<FoodDetails> getFoodByOriginDes(String origin, String destination);

	@Query(value = "select * from food_details where rating = ?1 and price = ?2", nativeQuery = true)
	public List<FoodDetails> getFoodByRatingPrice(int rating, int price);
	
}
