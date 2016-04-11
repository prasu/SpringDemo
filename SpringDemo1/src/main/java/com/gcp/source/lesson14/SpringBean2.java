package com.gcp.source.lesson14;

public class SpringBean2 {
	
	private String name="SpringBean2";

	public void init() throws Exception {
		System.out.println("init "+name);
		
	}

	public void cleanUp() throws Exception {
		System.out.println("cleanUp "+name);
		
	}
	
	public String toString(){
		return name;
		
	}
}
