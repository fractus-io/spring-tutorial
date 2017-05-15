package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessorBeanTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testBeanFactoryPostProcessorBean() {		

		BeanFactoryPostProcessorBean beanFactoryPostProcessorBean = (BeanFactoryPostProcessorBean)BEAN_FACTORY.getBean("beanFactoryPostProcessorBean");		
		
		assertEquals("theName", beanFactoryPostProcessorBean.getName());
		
	}	
}
