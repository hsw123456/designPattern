package com.hsw.designPattern.adapterpattern;

public class TestAdapter {

	public static void main(String[] args) {

		GBSocketInterface gbSocket = new GBSocket();

		Hotel hotel = new Hotel();

		SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

		hotel.setDbSocket(socketAdapter);

		hotel.charge();
	}

}
