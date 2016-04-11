package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson14.SpringBean1;
import com.gcp.source.lesson14.SpringBean2;
import com.gcp.source.lesson14.SpringBean3;
import com.gcp.source.main.AppConfig;

@Component("Lesson14")
public class Lesson14 implements LessonRunner {
	@Autowired 
	private AppConfig config;

	public void run() {
		
		((AbstractApplicationContext)config.getContext()).registerShutdownHook();
		
		SpringBean1 bean1 = (SpringBean1) config.getContext().getBean(SpringBean1.class);
		SpringBean2 bean2 = (SpringBean2) config.getContext().getBean(SpringBean2.class);		
		SpringBean3 bean3 = (SpringBean3) config.getContext().getBean(SpringBean3.class);


		System.out.println(bean1.toString());
		System.out.println(bean2.toString());
		System.out.println(bean3.toString());
		

	}

}
