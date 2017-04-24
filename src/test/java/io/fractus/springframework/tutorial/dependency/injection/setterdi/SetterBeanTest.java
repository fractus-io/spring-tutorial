package io.fractus.springframework.tutorial.dependency.injection.setterdi;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterBeanTest{

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("setterdi-context.xml");
	}
	
	@Test
	public void testSetterBean() {
		SetterBean setterBean = (SetterBean)BEAN_FACTORY.getBean("setterBean");
        assertEquals("value injected via setter", setterBean.getValueToInject());
	}
}
