package com.gcp.source.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LessonExecutor {

	public static void main(String[] args) {
		// loading the definitions from the given XML file
				ApplicationContext context = new ClassPathXmlApplicationContext("spring_lessons.xml");
				LessonFactory factory = context.getBean(LessonFactory.class);
				//factory.execute("Lesson12");
				//factory.execute("Lesson13");
				//factory.execute("Lesson14");
				factory.execute("Lesson15");

	}

}
