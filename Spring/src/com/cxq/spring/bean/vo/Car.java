package com.cxq.spring.bean.vo;

public class Car {

	private String brand;

	private float price;

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car's default constructor...");
	}
	
	public Car(String brand, float price) {
		this.brand = brand;
		this.price = price;
		System.out.println("Car's constructor with params...");
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Car's setBrand()...");
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		System.out.println("Car's setPrice()...");
		this.price = price;
	}
	
	public void initMethod(){
		System.out.println("Car's initMethod()...");
	}
	
	public void destory(){
		System.out.println("Car's destory() method...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price="
				+ price + "]";
	}

}
