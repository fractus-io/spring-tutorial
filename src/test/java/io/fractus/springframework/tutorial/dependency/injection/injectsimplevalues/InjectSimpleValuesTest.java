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
		
        assertEquals("24-Apr-2017 00:00:00", injectSimpleValues.getDate().toLocaleString());
        // to compare two float numbers is tricky due to float number precision, therefore we are using tolerance of the 0.02
        assertEquals(9.99, injectSimpleValues.getHeight(), 0.02);
        assertEquals("dstar55", injectSimpleValues.getName());
        assertEquals(2017, injectSimpleValues.getYear());
        assertEquals(true, injectSimpleValues.isSpringFun());
        assertEquals(1103760000, injectSimpleValues.getYearInSeconds().longValue());
	}
}
