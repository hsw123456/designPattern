package com.hsw.designPattern.factorymodel;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		Human human  = HumanFactory2.createFemale();
		human.eat();
		human.sleep();
		human.beat();
	}

}
