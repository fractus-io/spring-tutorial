/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameAwareBeanTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testBeanNameAwareBean() {		

		BeanNameAwareBean beanNameAwareBean = (BeanNameAwareBean)BEAN_FACTORY.getBean("beanNameAwareBean");

		assertEquals("aName", beanNameAwareBean.getName());
	}	
}