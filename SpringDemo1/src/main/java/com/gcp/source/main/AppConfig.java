package com.gcp.source.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.gcp.source.lessons.LessonRunner;

@Component
public class AppConfig implements ApplicationContextAware{
	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
		
	}
	
	public LessonRunner getBean(String lessonName){
		return (LessonRunner) context.getBean(lessonName);
	}
	
	public ApplicationContext getContext(){
		return context;
	}

}
