package com.yourcompany.restaurant.model;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Ingredient {
	@Id
	@Column(length = 6)
	private int id;
	
	@Column(length = 20)
	@Required
	private String name;
	
	private double costPerKg;

	public double getCostPerKg() {
		return costPerKg;
	}

	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}

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
}
