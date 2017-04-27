package io.fractus.springframework.tutorial.dependency.injection.beannaming;

import static org.junit.Assert.assertEquals;



import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNamingTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beannaming-context.xml");
	}
	
	@Test
	public void testBeanNaming() {		
		String s1 = (String)BEAN_FACTORY.getBean("name1");
		String s2 = (String)BEAN_FACTORY.getBean("name2");
		String s3 = (String)BEAN_FACTORY.getBean("name3");
		String s4 = (String)BEAN_FACTORY.getBean("name4");
		String s5 = (String)BEAN_FACTORY.getBean("namex1");
		String s6 = (String)BEAN_FACTORY.getBean("namex2");

		assertEquals(true, (s1 == s2));
		assertEquals(true, (s2 == s3));
		assertEquals(true, (s3 == s4));
		assertEquals(true, (s4 == s5));
		assertEquals(true, (s5 == s6));   
	}
}
