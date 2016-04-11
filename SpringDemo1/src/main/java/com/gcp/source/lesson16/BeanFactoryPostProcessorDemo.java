package com.gcp.source.lesson16;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorDemo implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory factory)
			throws BeansException {
		PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();    
		 cfg.setLocation(new ClassPathResource("demo.properties"));    
		 cfg.postProcessBeanFactory(factory);   
		 System.out.println("Bean factory post processor is initialized");  
		
	}

}
