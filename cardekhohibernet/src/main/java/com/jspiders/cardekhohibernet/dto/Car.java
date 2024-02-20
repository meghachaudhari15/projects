package com.jspiders.cardekhohibernet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "car_info")
public class Car {

	@Id
	@Column(name = "car_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "car_name")
	private String name;
	@Column(name = "car_brand")
	private String brand;
	@Column(name = "car_price")
	private double price;

}