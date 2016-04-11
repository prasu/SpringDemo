package com.gcp.source.lesson13;

import java.util.List;

public class Cat {
	
  public String name;
  private List<String> favFood;
  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFavFood() {
		return favFood;
	}
	public void setFavFood(List<String> favFood) {
		this.favFood = favFood;
	}
	
	public void info(){
		System.out.println(" name: "+ name+" "+favFood.toString());
	}

}
