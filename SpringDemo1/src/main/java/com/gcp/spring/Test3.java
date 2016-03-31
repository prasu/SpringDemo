package com.gcp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gcp.spring.test2.Circle;
import com.gcp.spring.test2.Diameter;

public class Test3 {
	
	public void autowire(){

		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
 
		Circle circle = (Circle) context
				.getBean("circle");
		for(Diameter d:circle.getListDiameter()){
			System.out.println(d.toString());
		}
		
		for(int i:circle.getListInt()){
			System.out.println(i);
		}
	}

}
