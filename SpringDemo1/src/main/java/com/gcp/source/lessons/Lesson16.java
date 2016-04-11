package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson16.Demo;
import com.gcp.source.main.AppConfig;

@Component("Lesson16")
public class Lesson16 implements LessonRunner {
	@Autowired
	private AppConfig config;

	public void run() {
		Demo demo = (Demo) config.getContext().getBean(Demo.class);
		System.out.println(demo.toString());

	}

}
