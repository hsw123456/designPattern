package com.hsw.designPattern.singleton;

//����ʽ���������ʹ���һ�����ŵ�ʵ��
public class Singleton1 {
	
	private static final Singleton1 instance = new Singleton1();
	
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		return instance;
	}
	
	

}
