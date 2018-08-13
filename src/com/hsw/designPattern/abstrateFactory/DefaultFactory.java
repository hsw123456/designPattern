package com.hsw.designPattern.abstrateFactory;

public class DefaultFactory extends AbstrateFactory {

	@Override
	public Vehicle createVehicle() {

		return new Car();
	}

	@Override
	public Weapon createWeapon() {

		return new AK47();
	}

	@Override
	public Food createFood() {

		return new Apple();
	}

}
