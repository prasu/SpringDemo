package com.gcp.source.lesson13;

public class Dog {
	private String name;
	private int count;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void info(){
		System.out.println(" name: "+ name+" "+
	                       " count "+ count+" "+
				            "age "+age);
	}

}
