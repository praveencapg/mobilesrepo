package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles {
	@Id
	private int id;
	private String brand;
	private String color;
	
	public Mobiles() {}
	
	
	

	public Mobiles(int id, String brand, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mobiles [id=" + id + ", brand=" + brand + ", color=" + color + "]";
	}
	
	

}
