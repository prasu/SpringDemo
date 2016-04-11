package org.gcp.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPLessonExecutor {

	public static void main(String[] args) {
		// loading the definitions from the given XML file
				ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop_lessons.xml");
				LessonFactory factory = context.getBean(LessonFactory.class);
				factory.execute("Lesson1");
	}

}
