/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

public class BeanPostProcessorBean {

	private String name;
	private String beforeInitialization;
	private String afterInitialization;
	
	public void init(){
	}

	public String getBeforeInitialization() {
    return beforeInitialization;
  }

  public void setBeforeInitialization(String beforeInitialization) {
    this.beforeInitialization = beforeInitialization;
  }


  public String getAfterInitialization() {
    return afterInitialization;
  }


  public void setAfterInitialization(String afterInitialization) {
    this.afterInitialization = afterInitialization;
  }


  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
