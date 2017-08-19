/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.applicationcontext;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareBeanTest {

 private static ApplicationContext APP_CONTEXT;
  
  @BeforeClass
  public static void before(){
    APP_CONTEXT = new ClassPathXmlApplicationContext("applicationcontextaware-context.xml");
  }
  
  @Test
  public void testAutoworing() {    
    
    ApplicationContextAwareBean applicationContextAwareBean = (ApplicationContextAwareBean)APP_CONTEXT.getBean("applicationContextAwareBean");
    assertNotNull(null, applicationContextAwareBean.getApplicationContext());    
  }
}
