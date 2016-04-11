package com.gcp.source.lesson17;

import org.springframework.beans.factory.annotation.Required;

public class Lion implements Animal{
	private Food food;
	private String name="LION";
	
	public void eat(){
		System.out.println(name+" is eating "+food.getType());
	}

	public Food getFood() {
		return food;
	}

	@Required
	public void setFood(Food food) {
		this.food = food;
	}

}
