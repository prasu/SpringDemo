package com.gcp.source.lesson14;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean3 {
	
	private String name="SpringBean3";

    @PostConstruct
	public void init() throws Exception {
		System.out.println("init "+name);
		
	}

    @PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("cleanUp "+name);
		
	}
	
	public String toString(){
		return name;
		
	}
}