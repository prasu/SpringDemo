package org.gcp.spring.aop.lessons;

import org.gcp.spring.aop.lesson1.ShapeService;
import org.gcp.spring.aop.main.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Lesson1")
public class Lesson1 implements LessonRunner {
	@Autowired
	private AppConfig config;

	public void run() {

		ShapeService service = (ShapeService)config.getContext().getBean("shapeService");
		System.out.println(service.getCircle().getName());
		System.out.println(service.getTriangle().getName());
		
	}

}
