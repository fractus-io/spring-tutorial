package io.fractus.springframework.tutorial.di.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("helloworld-context.xml");
	}
	
	@Test
	public void testHelloWorld() {
        HelloWorld hello = (HelloWorld)BEAN_FACTORY.getBean("helloWorld");
        assertEquals("Hello World", hello.sayHello());
	}
}
