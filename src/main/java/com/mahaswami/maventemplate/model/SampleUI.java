package com.mahaswami.maventemplate.model;

import org.openxava.annotations.*;

@View(name="Simple",members="number, name")
public class SampleUI {
	
	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
