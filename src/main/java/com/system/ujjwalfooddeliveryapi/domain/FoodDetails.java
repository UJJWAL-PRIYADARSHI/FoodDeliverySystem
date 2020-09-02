package com.system.ujjwalfooddeliveryapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "food_details")
@Getter
@Setter
public class FoodDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "res")
	private String restaurant;
	
	@Column(name = "f_name")
	private String foodName;
	
	@Column(name = "origin")
	private String origin;
	
	@Column(name = "des")
	private String destination;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "rating")
	private int rating;
}
