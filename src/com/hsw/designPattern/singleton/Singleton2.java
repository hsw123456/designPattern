package com.hsw.designPattern.singleton;
//����ʽ�����ж��Ƿ�Ϊ���ٴ������÷�ʽ�������ص��̰߳�ȫ����
public class Singleton2 {
	
	private static  Singleton2 instance = null;
	
	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		
		return instance;
	}

}
