/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

public class InitDestroyBean {

	private String beanName;
	private boolean isInitMethodInvoked = false;
	private boolean isDestroyMethodInvoked = false;
	
	public void init(){
		this.isInitMethodInvoked = true;
	}
	
	public void destroy(){
		this.isDestroyMethodInvoked = true;
	}
	
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public boolean isInitMethodInvoked() {
		return isInitMethodInvoked;
	}
	public boolean isDestroyMethodInvoked() {
		return isDestroyMethodInvoked;
	}
	
	
}
