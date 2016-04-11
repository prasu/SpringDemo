package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson13.Cat;
import com.gcp.source.lesson13.Dog;
import com.gcp.source.main.AppConfig;

@Component("Lesson13")
public class Lesson13 implements LessonRunner {
	@Autowired 
	private AppConfig config;

	public void run() {
		
		Cat cat = (Cat) config.getContext().getBean(Cat.class);
		Dog dog = (Dog) config.getContext().getBean(Dog.class);
		
		cat.info();
		dog.info();
		

	}

}
