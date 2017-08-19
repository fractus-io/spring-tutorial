/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beaninstantiationmodes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanInstantiationModesTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beaninstantiationmodes-context.xml");
	}
	
	@Test
	public void testBeanbeanInstantiationModes() {
		
        String firstSingleton = (String)BEAN_FACTORY.getBean("singleton");
        String secondSingleton = (String)BEAN_FACTORY.getBean("singleton");
        
        assertEquals(true, (firstSingleton == secondSingleton));
                
        String firstPrototype = (String)BEAN_FACTORY.getBean("prototype");
        String secondPrototype = (String)BEAN_FACTORY.getBean("prototype");
        
        assertEquals(false, (firstPrototype == secondPrototype));
	}
}
