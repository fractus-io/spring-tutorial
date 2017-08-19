/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.injectcollections;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectCollectionsTest {

	private static BeanFactory BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("injectcollections-context.xml");
	}
	
	@Test
	public void testInjectCollections() {
		InjectCollections injectCollections = (InjectCollections)BEAN_FACTORY.getBean("injectCollections");
		
		assertEquals("Hello World!", injectCollections.getMap().get("someValue"));
		assertEquals("aString", injectCollections.getMap().get("someBean"));
				
		assertEquals("firstValue", injectCollections.getProps().get("firstKey"));
		assertEquals("secondValue", injectCollections.getProps().get("secondKey"));
        			
        Object arraySet[] =  injectCollections.getSet().toArray();
        assertEquals(2, arraySet.length);
        assertEquals("Hello World!", arraySet[0]);
        assertEquals("aString", arraySet[1]);
       
		assertEquals(2, injectCollections.getList().size());			
        assertEquals("Hello World!", injectCollections.getList().get(0));
        assertEquals("aString", injectCollections.getList().get(1));		
	}
}
