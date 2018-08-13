package com.hsw.designPattern.factorymodel;

public class Male implements Human {

	@Override
	public void eat() {
		System.out.println("Male can eat ...");
	}

	@Override
	public void sleep() {
		System.out.println("Male can sleep ...");
	}

	@Override
	public void beat() {
		System.out.println("Male can beat ...");
	}

}
