package com.hsw.designPattern.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		Singleton4 s = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();
		
		System.out.println(s == s2);
	}

}
