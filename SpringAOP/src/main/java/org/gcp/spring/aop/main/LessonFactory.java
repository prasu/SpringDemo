package org.gcp.spring.aop.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LessonFactory {
	@Autowired 
	private AppConfig config;
	
	public void execute(String lessonName){
		config.getBean(lessonName).run();
	}
	

}
