package com.gcp.source.lesson14;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringBean1 implements DisposableBean,InitializingBean {
	
	private String name="SpringBean1";

	public void afterPropertiesSet() throws Exception {
		System.out.println("init "+ name);
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy "+ name);
		
	}
	
	public String toString(){
		return name;
		
	}

}
