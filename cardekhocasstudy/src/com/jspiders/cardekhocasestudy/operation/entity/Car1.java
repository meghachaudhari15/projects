package com.jspiders.cardekhocasestudy.entity;

public class Car1 {

	private int id;
	private String name;
	private String brand;
	private double price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", brand=" + brand + " , price=" + price + "]";
	}

	
	

	
}
