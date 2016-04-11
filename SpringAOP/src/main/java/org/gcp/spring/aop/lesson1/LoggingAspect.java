package org.gcp.spring.aop.lesson1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println("Logging Advice ran: Get Method call");
	}

}
