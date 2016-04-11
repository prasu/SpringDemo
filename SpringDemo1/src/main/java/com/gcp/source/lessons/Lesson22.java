package com.gcp.source.lessons;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson22.MessageGreet;
import com.gcp.source.main.AppConfig;

@Component("Lesson22")
public class Lesson22 implements LessonRunner {
	@Autowired
	private AppConfig config;

	public void run() {
		MessageGreet msgSource = config.getContext().getBean(MessageGreet.class);
		
		//System.out.println("IN 22");
		System.out.println(config.getContext().getMessage("greeting",null,"not found",null));
		System.out.println(msgSource.getMessageSource().getMessage("convey.msg",new Object[]{"prasu","Raj"},"not found",null));
		System.out.println(msgSource.getMessageSource().getMessage("greeting",new Object[]{"prasu"},"not found",new Locale("en","FR")));
	
	}

}