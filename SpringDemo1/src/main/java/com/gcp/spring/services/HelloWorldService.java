package com.gcp.spring.services;

import org.springframework.stereotype.Service;
 
@Service("helloWorldService")
public class HelloWorldService {
	private String type;
    private int count;
    private int height;
	private String name;
	private String msg;
	
	public HelloWorldService(int height,int count,String msg){
		this.height = height;
		this.count = count;
		this.msg = msg;
	}
	
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public void say(){
		System.out.println(count +" "+name+" "+" "+msg+" "+type+" "+height);
	}
}