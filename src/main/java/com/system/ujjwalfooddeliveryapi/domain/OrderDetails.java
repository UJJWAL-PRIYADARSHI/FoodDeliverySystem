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
@Table(name = "order_details")
@Getter
@Setter
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "c_name")
	private String customerName;
	
	@Column(name = "item")
	private String foodItem;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "restaurant")
	private String restaurant;
	
	@Column(name= "origin")
	private String origin;
	
	@Column(name = "date")
	private String date;
	
}