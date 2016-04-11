package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson17.Animal;
import com.gcp.source.main.AppConfig;

@Component("Lesson17")
public class Lesson17 implements LessonRunner {
	@Autowired
	private AppConfig config;

	public void run() {

		Animal animal = (Animal) config.getContext().getBean("lion");
		animal.eat();
		
		animal = (Animal) config.getContext().getBean("animal");
		animal.eat();

	}

}
