package io.fractus.springframework.tutorial.dependency.injection.setterdi;

public class SetterBean {

	private String valueToInject;

	public String getValueToInject() {
		return valueToInject;
	}

	public void setValueToInject(String valueToInject) {
		this.valueToInject = valueToInject;
	}
		
}
