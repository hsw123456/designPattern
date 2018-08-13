package com.hsw.designPattern.abstrateFactory;

public class TestAbstrateFactory {
	
	public static void main(String[] args) {
		
		AbstrateFactory factory  = new MagicFactory();
		Vehicle v = factory.createVehicle();
		v.run();
		Weapon w = factory.createWeapon();
		w.shoot();
		Food f = factory.createFood();
		f.printName();
	}

}
