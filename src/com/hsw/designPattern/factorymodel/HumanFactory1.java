package com.hsw.designPattern.factorymodel;

//�����������
public class HumanFactory1 {
	
	public Human createMale(){
		return new Male();
	}
	public Human createFemale(){
		return new Female();
	}
	
}
