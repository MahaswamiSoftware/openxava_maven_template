package com.yourcompany.restaurant.model;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Employee {

	@Id
	@Column(length = 6)
	private int id;
	
	@Column(length = 20)
	@Required
	private String name;
	
	@Column(length = 30)
	@Required
	private String email;
	
	@Column(length = 20)
	private String city;
	
	@OneToOne
	private Role role;

	//private boolean isAdmin;
	
	private double salary;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	/*public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}*/

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
