/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.autowiring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringBeanTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("autowiring-context.xml");
	}
	
	@Test
	public void testAutoworing() {		
		
		AutowiringBean autowiringBean = (AutowiringBean)BEAN_FACTORY.getBean("byName");
		assertNotNull(null, autowiringBean.getDependency());
		assertEquals(null, autowiringBean.getDependency2());
		
		autowiringBean = (AutowiringBean)BEAN_FACTORY.getBean("byType");
		assertNotNull(null, autowiringBean.getDependency());
		assertNotNull(null, autowiringBean.getDependency2());

		autowiringBean = (AutowiringBean)BEAN_FACTORY.getBean("autodetect");
		assertNotNull(null, autowiringBean.getDependency());
		assertNotNull(null, autowiringBean.getDependency2());

		autowiringBean = (AutowiringBean)BEAN_FACTORY.getBean("constructor");
		assertNotNull(null, autowiringBean.getDependency());
		assertNotNull(null, autowiringBean.getDependency2());
		
	}
}
