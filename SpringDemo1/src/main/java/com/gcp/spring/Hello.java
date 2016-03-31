package com.gcp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gcp.spring.services.HelloWorldService;
import com.gcp.spring.test1.Triangle;

/**
 * Hello world!
 *
 */
public class Hello 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Hello h = new Hello();
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		//h.helloService();
		//t1.triangle();
		t2.circle();
	}
	
	public void helloService(){

		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
 
		HelloWorldService service = (HelloWorldService) context
				.getBean("helloWorldService");
		String message = service.sayHello();
		System.out.println(message);
 
		//set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
		
		service.say();
	}
	
	
}
