package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{


	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if(bean instanceof BeanPostProcessorBean){
			BeanPostProcessorBean beanPostProcessorBean = (BeanPostProcessorBean)bean;
			// TODO before init method is called
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)	throws BeansException {
		
		if(bean instanceof BeanPostProcessorBean){
			BeanPostProcessorBean beanPostProcessorBean = (BeanPostProcessorBean)bean;
			// TODO after init method is called
		}
		return bean;
	}



}
