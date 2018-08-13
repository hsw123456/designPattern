package com.hsw.designPattern.singleton;

//����˫�ؼ�����(double check)�ĵ���ģʽ
public class Singleton4 {
	
	//volatile ��ֹ��������ָ��������
	private volatile static Singleton4 instance = null;

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}

		}

		return instance;

	}

}
