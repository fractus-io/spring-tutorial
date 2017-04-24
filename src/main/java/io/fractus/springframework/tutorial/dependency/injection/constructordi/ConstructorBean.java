package io.fractus.springframework.tutorial.dependency.injection.constructordi;

public class ConstructorBean {

	private String valueToInject;
	
	public ConstructorBean(final String valueToInject){
		this.valueToInject = valueToInject;
	}

	public String getValueToInject() {
		return valueToInject;
	}
		
}
