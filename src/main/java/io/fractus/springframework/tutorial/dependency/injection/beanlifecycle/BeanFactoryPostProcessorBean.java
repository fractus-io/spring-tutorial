/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

public class BeanFactoryPostProcessorBean implements BeanFactoryPostProcessor {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//  modifying Spring contextís bean definitions by adding property name to the bean definition 
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		 BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry)beanFactory;
		 
		 beanDefinitionRegistry.registerBeanDefinition("beanFactoryPostProcessorBean", 
				 BeanDefinitionBuilder
				 .genericBeanDefinition(BeanFactoryPostProcessorBean.class)
				 .addPropertyValue("name", "theName")
				 .getBeanDefinition());
	}
}
