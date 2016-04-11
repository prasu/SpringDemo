package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson23.Circle;
import com.gcp.source.main.AppConfig;

@Component("Lesson23")
public class Lesson23 implements LessonRunner {
	@Autowired
	private AppConfig config;

	public void run() {
		Circle circle = (Circle) config.getContext().getBean(Circle.class);
	    circle.draw();
	}

}
