package io.fractus.springframework.tutorial.dependency.injection.constructordi;

import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBeanTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("constructordi-context.xml");
	}
	
	@Test
	public void testHelloWorld() {
		ConstructorBean constructorBean = (ConstructorBean)BEAN_FACTORY.getBean("constructorBean");
        assertEquals("value injected via constructor", constructorBean.getValueToInject());
	}
}
