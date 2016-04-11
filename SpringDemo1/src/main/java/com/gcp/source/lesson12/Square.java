package com.gcp.source.lesson12;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements ApplicationContextAware,BeanNameAware{
	private ApplicationContext context;
	
	public void draw(){
		System.out.println("Side of the square : "+getSide().toString());
		
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}
	
	public Side getSide(){
		return (Side) context.getBean("sideA");
	}

	public void setBeanName(String arg0) {
		System.out.println("Bean name: "+arg0);
		
	}

}
