package com.system.ujjwalfooddeliveryapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.system.ujjwalfooddeliveryapi.domain.FoodDetails;

@Repository
public interface FoodRepository extends CrudRepository<FoodDetails, Long>{

}
