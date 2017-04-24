package io.fractus.springframework.tutorial.dependency.injection.injectsimplevalues;

import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectSimpleValuesTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("injectsimplevalues-context.xml");
	}
	
	@Test
	public void testInjectSimpleValues() {
		InjectSimpleValues injectSimpleValues = (InjectSimpleValues)BEAN_FACTORY.getBean("injectSimpleValues");
        assertEquals("Mon Apr 24 00:00:00 CEST 2017", injectSimpleValues.getDate().toString());
        //assertEquals(9.99, injectSimpleValues.getHeight(), 0.0);
        assertEquals("dstar55", injectSimpleValues.getName());
        assertEquals(2017, injectSimpleValues.getYear());
        assertEquals(true, injectSimpleValues.isSpringFun());
        assertEquals(1103760000, injectSimpleValues.getYearInSeconds().longValue());
	}
}
