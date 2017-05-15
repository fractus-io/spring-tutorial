package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorBean implements BeanPostProcessor{


	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)	throws BeansException {
		
		System.out.println("postProcessAfterInitialization " + bean + " " + beanName);
		return bean;
	}


	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("postProcessBeforeInitialization " + bean + " " + beanName);
		return bean;
	}

}
