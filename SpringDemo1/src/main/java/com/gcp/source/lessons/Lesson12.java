package com.gcp.source.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gcp.source.lesson12.Square;

@Component("Lesson12")
public class Lesson12 implements LessonRunner {
	
	@Autowired
	private Square square;

	public void run() {
		square.draw();		
	}
	

}
