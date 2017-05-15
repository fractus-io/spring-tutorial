package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

public class BeanPostProcessorBean {

	private String name;

	public void init(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
