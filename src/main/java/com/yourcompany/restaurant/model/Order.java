package com.yourcompany.restaurant.model;

import java.util.*;
import javax.persistence.*;
import org.openxava.annotations.*;
import com.yourcompany.restaurant.calculators.*;

@Entity
public class Order {
	@Id
	@Column(length = 6)
	private int id;
	
	@Column(length = 20)
	@Required
	private String customer;
	
	@Column(length = 10)
	private String customerMobile;
	
	//private String quantity;
	
	@OneToOne
	private Employee waiter;
	
	@ManyToMany
	private List<Recipe> recipes;
	
	@Column(length=6)
	@Stereotype("MONEY")
	@DefaultValueCalculator(
			value=BillCalculator.class, 
			properties=@PropertyValue(name="id", from="order.id"))
	private double totalBillAmount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	/*public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}*/

	public Employee getWaiter() {
		return waiter;
	}

	public void setWaiter(Employee waiter) {
		this.waiter = waiter;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public double getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	
}
