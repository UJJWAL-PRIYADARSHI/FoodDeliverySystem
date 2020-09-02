package com.system.ujjwalfooddeliveryapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.system.ujjwalfooddeliveryapi.domain.OrderDetails;

@Repository
public interface OrderRepository extends CrudRepository<OrderDetails, Long>{

}
