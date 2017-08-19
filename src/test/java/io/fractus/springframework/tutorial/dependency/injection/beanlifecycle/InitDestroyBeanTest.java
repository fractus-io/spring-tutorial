/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyBeanTest {

	private static ClassPathXmlApplicationContext BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testInitDestroyBean() {		

		InitDestroyBean initDestroyBean = (InitDestroyBean)BEAN_FACTORY.getBean("initDestroyBean");

		assertEquals(true, initDestroyBean.isInitMethodInvoked());
		assertEquals("aName", initDestroyBean.getBeanName());
		assertEquals(false, initDestroyBean.isDestroyMethodInvoked());
		
		BEAN_FACTORY.destroy();
		
		assertEquals(true, initDestroyBean.isDestroyMethodInvoked());
	}
	
}
