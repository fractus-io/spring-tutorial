package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

	  // initial additional field beforeInitialization
		if(bean instanceof BeanPostProcessorBean){
			BeanPostProcessorBean beanPostProcessorBean = (BeanPostProcessorBean)bean;
			beanPostProcessorBean.setBeforeInitialization("beforeInitialization");			
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)	throws BeansException {

	  // initial additional field afterInitialization
		if(bean instanceof BeanPostProcessorBean){
			BeanPostProcessorBean beanPostProcessorBean = (BeanPostProcessorBean)bean;
			beanPostProcessorBean.setAfterInitialization("afterInitialization");
		}
		return bean;
	}



}
