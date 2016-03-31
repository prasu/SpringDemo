package com.gcp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gcp.spring.test1.Triangle;

public class Test1 {
	public void triangle(){

		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
 
		Triangle tri = (Triangle) context
				.getBean("triangle");
		tri.draw();
 
		
	}

}
