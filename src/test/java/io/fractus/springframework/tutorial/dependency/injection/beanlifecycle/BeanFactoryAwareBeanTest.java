package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryAwareBeanTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testBeanNameAwareBean() {		

		BeanFactoryAwareBean beanFactoryAwareBean = (BeanFactoryAwareBean)BEAN_FACTORY.getBean("beanFactoryAwareBean");		
		assertEquals("aName", beanFactoryAwareBean.getName());
		
		beanFactoryAwareBean = (BeanFactoryAwareBean)beanFactoryAwareBean.getBeanFactory().getBean("beanFactoryAwareBean");		
		assertEquals("aName", beanFactoryAwareBean.getName());
		
	}	
}