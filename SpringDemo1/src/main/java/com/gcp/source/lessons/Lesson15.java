package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.main.AppConfig;

@Component("Lesson15")
public class Lesson15 implements LessonRunner {
	@Autowired 
	private AppConfig config;

	public void run() {
		
		

	}

}