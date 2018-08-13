package com.hsw.designPattern.singleton;

//ʹ�þ�̬�ڲ���**ǿ���Ƽ�
public class Singleton5 {

	private static class InstanceHolder {
		private final static Singleton5 instance = new Singleton5();
	}

	private Singleton5() {
	}

	public static Singleton5 getInstance() {

		return InstanceHolder.instance;
	}

}
