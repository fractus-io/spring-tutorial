/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingDisposableBeanTest {

private static ClassPathXmlApplicationContext BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testInitializingDisposableBean() {		

		InitializingDisposableBean initializingDisposableBean = (InitializingDisposableBean)BEAN_FACTORY.getBean("initializingDisposableBean");
		
		assertNotNull(initializingDisposableBean);

		assertEquals(true, initializingDisposableBean.isInitMethodInvoked());
		assertEquals("newBeanName", initializingDisposableBean.getBeanName());
		assertEquals(false, initializingDisposableBean.isDestroyMethodInvoked());
		
		BEAN_FACTORY.destroy();
		
		assertEquals(true, initializingDisposableBean.isDestroyMethodInvoked());
	}
}
