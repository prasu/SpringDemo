package com.gcp.source.lesson19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car implements Vehicle{
	private Engine engine;

	
	public void run(){
		System.out.println(" Engine :"+engine.getType());
	}


	public Engine getEngine() {
		return engine;
	}

    @Autowired
    //@Qualifier("cycleEngine")
    @Qualifier("eng")
    void setEngine(Engine engine) {
		this.engine = engine;
	}
}
