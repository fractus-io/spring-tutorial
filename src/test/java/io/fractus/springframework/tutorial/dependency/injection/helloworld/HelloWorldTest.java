/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.helloworld;

import static org.junit.Assert.assertEquals;
import io.fractus.springframework.tutorial.dependency.injection.helloworld.HelloWorld;

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
