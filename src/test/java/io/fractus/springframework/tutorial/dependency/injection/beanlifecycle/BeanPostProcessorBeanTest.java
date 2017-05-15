package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorBeanTest {

	
	private static ClassPathXmlApplicationContext BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testBeanPostProcessorBean() {		

		BeanPostProcessorBean beanPostProcessorBean = (BeanPostProcessorBean)BEAN_FACTORY.getBean("beanPostProcessorBean");		
		
		assertEquals("aName", beanPostProcessorBean.getName());
						
	}	
}
