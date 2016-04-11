package com.gcp.source.lesson19;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	private Engine engine;

	public void run() {
		System.out.println(" Engine :" + engine.getType());
	}

	public Engine getEngine() {
		return engine;
	}

	@Resource(name="noeng")
	void setEngine(Engine engine) {
		this.engine = engine;
	}
}