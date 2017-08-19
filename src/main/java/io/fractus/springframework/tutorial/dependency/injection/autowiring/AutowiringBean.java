/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.autowiring;

public class AutowiringBean {

	private Dependency dependency;
	
	private Dependency dependency2;

	public AutowiringBean(){	
	}

	public AutowiringBean(Dependency dependency){
		this.dependency = dependency;
	}

	public AutowiringBean(Dependency dependency, Dependency dependency2){
		this.dependency = dependency;
		this.dependency2 = dependency2;
	}

	public Dependency getDependency() {
		return dependency;
	}

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	public Dependency getDependency2() {
		return dependency2;
	}

	public void setDependency2(Dependency dependency2) {
		this.dependency2 = dependency2;
	}

	
}
