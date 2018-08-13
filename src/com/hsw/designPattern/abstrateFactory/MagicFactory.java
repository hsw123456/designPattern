package com.hsw.designPattern.abstrateFactory;

public class MagicFactory  extends AbstrateFactory{

	@Override
	public Vehicle createVehicle() {
		return new Broom();
	}

	@Override
	public Weapon createWeapon() {
		return new MagicStick();
	}

	@Override
	public Food createFood() {
		return new MushRoom();
	}

}
