package com.yourcompany.restaurant.model;

import java.util.*;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Recipe {
	@Id
	@Column(length = 6)
	private int id;
	
	@Column(length = 20)
	@Required
	private String name;
	
	@Stereotype("MONEY")
	private double cost;
	
	private String process;
	
	@ManyToOne
	private Employee cook;
	
	@ManyToMany
	private List<Ingredient> ingredients;
	
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public Employee getCook() {
		return cook;
	}

	public void setCook(Employee cook) {
		this.cook = cook;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
