/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.injectsimplevalues;

import java.util.Date;

public class InjectSimpleValues {

    private String name;
    private int year;
    private float height;
    private boolean isSpringFun;
    private Long yearInSeconds;
    private Date date;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isSpringFun() {
		return isSpringFun;
	}
	public void setSpringFun(boolean isSpringFun) {
		this.isSpringFun = isSpringFun;
	}
	public Long getYearInSeconds() {
		return yearInSeconds;
	}
	public void setYearInSeconds(Long yearInSeconds) {
		this.yearInSeconds = yearInSeconds;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
