package com.gcp.source.lesson23;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle  implements ApplicationEventPublisherAware{
	private String name="circle";
	private ApplicationEventPublisher publisher;
	
	public void draw(){
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher pub) {
		publisher = pub;
		
	}

}
