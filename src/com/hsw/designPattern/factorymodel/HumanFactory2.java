package com.hsw.designPattern.factorymodel;

//��̬��������ģʽ
public class HumanFactory2 {
	
	public  static Human createMale(){
		return new Male();
	}
	public static Human createFemale(){
		return new Female();
	}
	
}
