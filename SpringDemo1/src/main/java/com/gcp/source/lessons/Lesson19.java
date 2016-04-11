package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson19.Vehicle;
import com.gcp.source.main.AppConfig;

@Component("Lesson19")
public class Lesson19 implements LessonRunner {
	@Autowired
	private AppConfig config;

	public void run() {

		Vehicle vehicle = (Vehicle) config.getContext().getBean("car");
		vehicle.run();
	}

}
