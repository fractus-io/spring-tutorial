package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitializingDisposableBean implements InitializingBean, DisposableBean {

	private String beanName;
	private boolean isAfterPropertiesSetMethodInvoked = false;
	private boolean isDestroyMethodInvoked = false;
		
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public boolean isInitMethodInvoked() {
		return isAfterPropertiesSetMethodInvoked;
	}
	public boolean isDestroyMethodInvoked() {
		return isDestroyMethodInvoked;
	}

	public void afterPropertiesSet() throws Exception {
		this.isAfterPropertiesSetMethodInvoked = true;
		this.setBeanName("newBeanName");
	}
	
	public void destroy(){
		this.isDestroyMethodInvoked = true;
	}
	
}
