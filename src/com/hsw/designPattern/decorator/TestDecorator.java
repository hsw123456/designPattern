package com.hsw.designPattern.decorator;

public class TestDecorator {
	
	public static void main(String[] args) {
		
		Girl g = new Tall(new GoldenHair(new AmericaGirl()));
		System.out.println(g.getDescription());
	}

}
